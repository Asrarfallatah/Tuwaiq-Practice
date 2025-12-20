package org.example.ecommerce.Service;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.Model.Category;
import org.example.ecommerce.Model.MerchantStock;
import org.example.ecommerce.Model.Product;
import org.example.ecommerce.Model.Purchase;
import org.example.ecommerce.Model.User;
import org.example.ecommerce.Repository.CategoryRepository;
import org.example.ecommerce.Repository.MerchantStockRepository;
import org.example.ecommerce.Repository.ProductRepository;
import org.example.ecommerce.Repository.PurchaseRepository;
import org.example.ecommerce.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final MerchantStockRepository merchantStockRepository;
    private final PurchaseRepository purchaseRepository;
    private final CategoryRepository categoryRepository;

    // get all users
    public List<User> getUserRepository() {
        return userRepository.findAll();
    }

    // add user
    public void addUser(User user){
        userRepository.save(user);
    }

    // update user
    public boolean updateUser(Integer userID, User user){

        if (!userRepository.existsById(userID)){
            return false;
        }

        User oldUser = userRepository.getById(userID);

        oldUser.setUserName(user.getUserName());
        oldUser.setUserPassword(user.getUserPassword());
        oldUser.setUserEmail(user.getUserEmail());
        oldUser.setUserRole(user.getUserRole());
        oldUser.setUserBalance(user.getUserBalance());

        userRepository.save(oldUser);
        return true;
    }

    // delete user
    public boolean deleteUser(Integer userID){

        if (!userRepository.existsById(userID)){
            return false;
        }

        userRepository.deleteById(userID);
        return true;
    }

    /// //////////////////// //////////////////// //////////////////// //////////////////// //////////////////// /////////////////

    // BUY PRODUCT
    public int buyProduct(Integer userID, Integer productID, Integer merchantID){

        User user = userRepository.findById(userID).orElse(null);
        if (user == null) return 2;

        Product product = productRepository.findById(productID).orElse(null);
        if (product == null) return 3;

        MerchantStock merchantStock =
                merchantStockRepository.findByProductIDAndMerchantID(productID, merchantID);

        if (merchantStock == null) return 4;
        if (merchantStock.getMerchantStock() <= 0) return 5;

        if (user.getUserRole().equalsIgnoreCase("admin")) return 7;
        if (user.getUserBalance() < product.getProductPrice()) return 6;

        // update balance
        user.setUserBalance(user.getUserBalance() - product.getProductPrice());
        userRepository.save(user);

        //  stock -1
        merchantStock.setMerchantStock(merchantStock.getMerchantStock() - 1);
        merchantStockRepository.save(merchantStock);

        // save purchase
        Purchase purchase = new Purchase();
        purchase.setUserID(userID);
        purchase.setProductID(productID);
        purchase.setMerchantID(merchantID);
        purchase.setPrice(product.getProductPrice());
        purchase.setCreatedAt(LocalDateTime.now());

        purchaseRepository.save(purchase);

        return 1;
    }

    /// //////////////////// //////////////////// //////////////////// //////////////////// //////////////////// /////////////////


    // extra point 1: get products sorted by price for a specific category
    public List<Product> sortProductsByCategory(String categoryName, String order){

        Category category = categoryRepository.findByCategoryNameIgnoreCase(categoryName);
        if (category == null){
            return List.of();

        }

        List<Product> products = productRepository.findByCategoryID(category.getCategoryID());

        if (order.equalsIgnoreCase("asc")){
            products.sort((a, b) -> Double.compare(a.getProductPrice(), b.getProductPrice()));
        } else {
            products.sort((a, b) -> Double.compare(b.getProductPrice(), a.getProductPrice()));
        }

        return products;
    }

    // extra point 2 : get all products for a specific category
    public List<Product> getByCategory(String categoryName){

        Category category = categoryRepository.findByCategoryNameIgnoreCase(categoryName);
        if (category == null){
            return List.of();
        }

        return productRepository.findByCategoryID(category.getCategoryID());
    }

    // extra point 3 : add balance to a user
    public boolean addToBalance(Integer userID, double amount){

        User user = userRepository.findById(userID).orElse(null);
        if (user == null){
            return false;
        }

        user.setUserBalance(user.getUserBalance() + amount);
        userRepository.save(user);

        return true;
    }

    // extra point 4 : see products that are in stock
    public List<MerchantStock> getProductInStock(){
        return merchantStockRepository.findByMerchantStockGreaterThan(0);
    }

    // extra point 5 : search product by name
    public Product foundProduct(String productName){
        return productRepository.findByProductNameIgnoreCase(productName);
    }

    /// //////////////////// //////////////////// //////////////////// //////////////////// //////////////////// /////////////////


    // get purchase history
    public List<Purchase> getUserPurchaseHistory(Integer userID){
        return purchaseRepository.findByUserID(userID);
    }
}
