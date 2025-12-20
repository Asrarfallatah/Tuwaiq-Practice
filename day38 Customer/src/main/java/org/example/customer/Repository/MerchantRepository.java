package org.example.customer.Repository;


import org.example.customer.Model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant , Integer> {

    Merchant findMerchantByMerchantId(Integer merchantId);


}
