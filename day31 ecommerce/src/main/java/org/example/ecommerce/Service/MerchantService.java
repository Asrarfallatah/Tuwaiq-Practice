package org.example.ecommerce.Service;

import lombok.AllArgsConstructor;
import org.example.ecommerce.Model.Merchant;
import org.example.ecommerce.Model.MerchantStock;
import org.example.ecommerce.Model.Product;
import org.example.ecommerce.Repository.MerchantRepository;
import org.example.ecommerce.Repository.MerchantStockRepository;
import org.example.ecommerce.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MerchantService {


    private final MerchantRepository merchantRepository;
    private final MerchantStockRepository merchantStockRepository;
    private final ProductRepository productRepository;

    // display all merchants information
    public List<Merchant> getMerchants(){
        return merchantRepository.findAll();
    }


    // add merchant information
    public void addMerchant(Merchant merchant){
        merchantRepository.save(merchant);
    }


    // update merchant information
    public boolean updateMerchant(Integer merchantId , Merchant merchant){

        // check if it is there in the database
        Merchant oldMerchant = merchantRepository.getById(merchantId);
        if (oldMerchant == null){
            return false;
        }

        //update the old one each variable
        oldMerchant.setMerchantName(merchant.getMerchantName());

        // save it
        merchantRepository.save(oldMerchant);

        return true;
    }


    // delete merchant information
    public boolean deleteMerchant(Integer merchantId){

        // check if it is there in the database
        Merchant merchant = merchantRepository.getById(merchantId);
        if (merchant == null){
            return false;
        }
        merchantRepository.delete(merchant);

        return true;
    }



    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // add more stock to a specific merchant stock
    public String addMoreStock(Integer productID , Integer merchantID , Integer amount ){

        MerchantStock merchantStock = merchantStockRepository.findByProductIDAndMerchantID(productID, merchantID);

        if (merchantStock == null){
            return "error no merchant stoke with that information is found in the DataBase ! ";
        }

        // update stock
        merchantStock.setMerchantStock( merchantStock.getMerchantStock() + amount );
        merchantStockRepository.save(merchantStock);

        return "Stoke has been filled and increased in the DataBase Successfully ! ";

    }




    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // extra point 7 : calculate how much a merchant earned
    public double getEarnings(Integer merchantID){

        List<MerchantStock> merchantStocks = merchantStockRepository.findAll();

        double totalEarnings = 0.0;

        for (int i = 0; i < merchantStocks.size(); i++) {

            if (merchantStocks.get(i).getMerchantID().equals(merchantID)){

                int currentStock = merchantStocks.get(i).getMerchantStock();
                int initialStock = 10;

                int sold = initialStock - currentStock;

                if (sold > 0){

                    //get the product from DB using productRepository
                    Product product = productRepository.getById(
                            merchantStocks.get(i).getProductID()
                    );

                    if (product != null){
                        totalEarnings += sold * product.getProductPrice();
                    }
                }
            }
        }

        return totalEarnings;
    }


    // extra point 8 : see  most selling product and how many it sell

    public String getMerchantMostBoughtItem(Integer merchantID) {

        List<MerchantStock> merchantStocks = merchantStockRepository.findAll();

        int maxCount = 0;
        Integer mostBoughtProductID = null;

        for (int i = 0; i < merchantStocks.size(); i++) {

            if (merchantStocks.get(i).getMerchantID().equals(merchantID)) {

                int sold = 10 - merchantStocks.get(i).getMerchantStock();

                if (sold > maxCount) {
                    maxCount = sold;
                    mostBoughtProductID = merchantStocks.get(i).getProductID();
                }
            }
        }

        if (mostBoughtProductID == null) {
            return "This merchant has no items purchased yet ! ";
        }

        return "Product with ID " + mostBoughtProductID + " was bought " + maxCount + " times";
    }






}