package org.example.ecommerce.Service;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.Model.Product;
import org.example.ecommerce.Repository.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;



    // display all products
    public List<Product> getProducts(){
        return productRepository.findAll();
    }



    // add product information
    public void addProduct(Product product){
        productRepository.save(product);
    }



    // update product information
    public boolean updateProduct(Integer productID , Product product){

        Product oldProduct = productRepository.getById(productID);
        if (oldProduct == null){
            return false;
        }

        oldProduct.setProductName(product.getProductName());
        oldProduct.setProductPrice(product.getProductPrice());
        oldProduct.setCategoryID(product.getCategoryID());

        productRepository.save(oldProduct);

        return true;
    }



    // delete product information
    public boolean deleteProduct(Integer productId){

        Product Product = productRepository.getById(productId);
        if (Product == null){
            return false;
        }

        productRepository.delete(Product);

        return true;
    }


    /// //////////////////////////////////////////////////////////////////////////////////////


}
