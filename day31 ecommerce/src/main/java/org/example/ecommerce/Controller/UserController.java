package org.example.ecommerce.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.ecommerce.ApiResponse.ApiResponse;
import org.example.ecommerce.Model.MerchantStock;
import org.example.ecommerce.Model.Product;
import org.example.ecommerce.Model.Purchase;
import org.example.ecommerce.Model.User;
import org.example.ecommerce.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    public final UserService userService;

    // get all users
    @GetMapping("/get")
    public ResponseEntity<?> getUsers(){

        if (userService.getUserRepository().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no users in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(userService.getUserRepository());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@Valid @RequestBody User user , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        userService.addUser(user);
        return ResponseEntity.status(200).body(new ApiResponse("user information has been added to the DataBase Successfully ! "));
    }

    // update
    @PutMapping("/update/{userID}")
    public ResponseEntity<?> updateUser(@PathVariable Integer userID , @Valid @RequestBody User user , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean isUpdated = userService.updateUser(userID, user);

        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no user with that ID in the DataBase  is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("user information has been updated Successfully ! "));
    }

    // delete
    @DeleteMapping("/delete/{userID}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer userID){

        boolean isDeleted = userService.deleteUser(userID);

        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no user with that ID in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("user information has been deleted Successfully ! "));
    }

    // buy
    @PutMapping("/buy/{userID}/{productID}/{merchantID}")
    public ResponseEntity<?> buyProduct(@PathVariable Integer userID , @PathVariable Integer productID , @PathVariable Integer merchantID){

        int result = userService.buyProduct(userID , productID , merchantID);

        switch (result){

            case 1:
                return ResponseEntity.status(200).body(new ApiResponse("Product has been purchased Successfully !"));

            case 2:
                return ResponseEntity.status(400).body(new ApiResponse("User ID is not found in the DataBase !"));

            case 3:
                return ResponseEntity.status(400).body(new ApiResponse("Product ID is not found in the DataBase !"));

            case 4:
                return ResponseEntity.status(400).body(new ApiResponse("Merchant does not have this product in the stock !"));

            case 5:
                return ResponseEntity.status(400).body(new ApiResponse("This product is out of stock !"));

            case 6:
                return ResponseEntity.status(400).body(new ApiResponse("User balance is less than product price !"));

            case 7:
                return ResponseEntity.status(400).body(new ApiResponse("Admin users are not allowed to buy products !"));

            default:
                return ResponseEntity.status(400).body(new ApiResponse("some error happened !"));
        }
    }

    // extra point 1: sort
    @GetMapping("/sort-category/{categoryName}/{order}")
    public ResponseEntity<?> getSortedProducts(@PathVariable String categoryName , @PathVariable String order){

        List<Product> sorted = userService.sortProductsByCategory(categoryName , order);

        if (sorted.isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no products found in the DataBase to sort them !"));
        }

        return ResponseEntity.status(200).body(sorted);
    }

    // extra point 2: filter category
    @GetMapping("/category/{categoryName}")
    public ResponseEntity<?> getProductsByCategory(@PathVariable String categoryName){

        List<Product> products = userService.getByCategory(categoryName);

        if (products.isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("No products with that category name in the DataBase !"));
        }

        return ResponseEntity.status(200).body(products);
    }

    // extra point 3: add balance
    @PutMapping("/add-balance/{userID}/{amount}")
    public ResponseEntity<?> addBalance(@PathVariable Integer userID , @PathVariable double amount){

        boolean isAdded = userService.addToBalance(userID , amount);

        if (!isAdded){
            return ResponseEntity.status(400).body(new ApiResponse("No user with that ID in the DataBase !"));
        }

        return ResponseEntity.status(200).body(new ApiResponse("Balance has been added Successfully !"));
    }

    // extra point 4: products in stock
    @GetMapping("/in-stock")
    public ResponseEntity<?> getProductsInStock(){

        List<MerchantStock> inStock = userService.getProductInStock();

        if (inStock.isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no products in stock in the DataBase !"));
        }

        return ResponseEntity.status(200).body(inStock);
    }

    // extra point 5: search
    @GetMapping("/search-product/{productName}")
    public ResponseEntity<?> searchProduct(@PathVariable String productName){

        Product product = userService.foundProduct(productName);

        if (product == null){
            return ResponseEntity.status(400).body(new ApiResponse("No product with that name in the DataBase !"));
        }

        return ResponseEntity.status(200).body(product);
    }

    // history
    @GetMapping("/history/{userID}")
    public ResponseEntity<?> getHistory(@PathVariable Integer userID){

        List<Purchase> history = userService.getUserPurchaseHistory(userID);

        if (history.isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("This user did not buy any thing yet !"));
        }

        return ResponseEntity.status(200).body(history);
    }
}
