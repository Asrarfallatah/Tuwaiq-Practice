package org.example.ecommerce.Repository;

import org.example.ecommerce.Model.MerchantStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MerchantStockRepository extends JpaRepository<MerchantStock, Integer> {

    MerchantStock findByProductIDAndMerchantID(Integer productID, Integer merchantID);

    List<MerchantStock> findByMerchantStockGreaterThan(Integer merchantStock);

}
