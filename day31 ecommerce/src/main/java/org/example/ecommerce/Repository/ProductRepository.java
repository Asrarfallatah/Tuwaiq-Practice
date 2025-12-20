package org.example.ecommerce.Repository;


import org.example.ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategoryID(Integer categoryID);

    Product findByProductNameIgnoreCase(String productName);
}
