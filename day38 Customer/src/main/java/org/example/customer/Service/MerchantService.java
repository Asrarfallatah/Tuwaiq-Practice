package org.example.customer.Service;


import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiException;
import org.example.customer.Model.Customer;
import org.example.customer.Model.Merchant;
import org.example.customer.Repository.CustomerRepository;
import org.example.customer.Repository.MerchantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchantService {

    private final MerchantRepository merchantRepository;
    private final CustomerService customerService;
    private final CustomerRepository customerRepository;

    // get all merchants
    public List<Merchant> getAllMerchants(){

        // check if there are no merchants in database
        if (merchantRepository.findAll().isEmpty()){
            throw new ApiException("error there are no merchants in the database yet to show their information's ! ");
        }

        return merchantRepository.findAll();
    }

    // add merchant
    public void addMerchant(Merchant merchant){

        // check for null values
        if (merchant.getName() == null || merchant.getName().isEmpty()){
            throw new ApiException("error merchant name can not be empty !");
        }

        // check input mismatch
        if (merchant.getName().matches(".*\\d.*")){
            throw new ApiException("error merchant name can not contain numbers !");
        }

        // add it
        merchantRepository.save(merchant);

    }


    // update merchant
    public void updateMerchant(Integer merchantId , Merchant merchant){

        // check for null values
        if (merchant.getName() == null || merchant.getName().isEmpty()){
            throw new ApiException("error merchant name can not be empty !");
        }
        if (merchantId == null){
            throw new ApiException("error merchant id can not be null !");
        }

        // check input mismatch
        if (merchant.getName().matches(".*\\d.*")){
            throw new ApiException("error merchant name can not contain numbers !");
        }

        // find the merchant
        Merchant oldMerchant = merchantRepository.findMerchantByMerchantId(merchantId);
        if (oldMerchant == null){
            throw new ApiException("error merchant with id "+ merchantId +" not found !");
        }

        // update it
        oldMerchant.setName(merchant.getName());
        merchantRepository.save(oldMerchant);

    }


    // delete merchant
    public void deleteMerchant (Integer merchantId){

        // check for null value
        if (merchantId == null){
            throw new ApiException("error merchant id can not be null !");
        }

        // find the merchant
        Merchant merchant = merchantRepository.findMerchantByMerchantId(merchantId);
        if (merchant == null){
            throw new ApiException("error merchant with id "+ merchantId +" not found !");
        }

        // delete it
        merchantRepository.delete(merchant);

    }


    ///  extra endpoints

    //1- count how a specific merchant has many branches
    public Integer countBranchesOfMerchant (Integer merchantId){
        // find the merchant
        Merchant merchant = merchantRepository.findMerchantByMerchantId(merchantId);
        if (merchant == null){
            throw new ApiException("error merchant with id "+ merchantId +" not found !");
        }

        // count branches
        return merchant.getBranches().size();
    }


    // 2- assign customer to merchant
    public void assignCustomerToMerchant (Integer merchantId , Integer customerId){

        // check if merchant exists
        Merchant merchant = merchantRepository.findMerchantByMerchantId(merchantId);
        if (merchant == null) {
            throw new ApiException("error merchant with id " + merchantId + " not found !");
        }

        // check if customer exists
        Customer customer = customerRepository.findCustomerByCustomerId(customerId);
        if (customer == null) {
            throw new ApiException("error customer with id " + customerId + " not found !");
        }

        // assign
        customer.getMerchants().add(merchant);
        merchant.getCustomers().add(customer);

        // save
        customerRepository.save(customer);
        merchantRepository.save(merchant);

    }




}
