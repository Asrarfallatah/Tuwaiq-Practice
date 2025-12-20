package org.example.ecommerce.Service;


import lombok.RequiredArgsConstructor;
import org.example.ecommerce.Model.MerchantStock;
import org.example.ecommerce.Repository.MerchantStockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchantStockService {



    private final MerchantStockRepository merchantStocksRepository;

    // display all merchant stocks
    public List<MerchantStock> getMerchantStocksRepository(){
        return merchantStocksRepository.findAll();
    }

    public List<MerchantStock> getMerchantStocks(){
        return merchantStocksRepository.findAll();
    }


    // add merchant stock information
    public void addMerchantStock(MerchantStock merchantStock){
        merchantStocksRepository.save(merchantStock);
    }


    // update merchant stock information
    public boolean updateMerchantStock(Integer merchantStockID , MerchantStock merchantStock){

        MerchantStock oldMerchantStock = merchantStocksRepository.getById(merchantStockID);
        if (oldMerchantStock== null){
            return false;
        }

       oldMerchantStock.setMerchantStock(merchantStock.getMerchantStock());
       oldMerchantStock.setMerchantID(merchantStock.getMerchantID());
       oldMerchantStock.setProductID(merchantStock.getMerchantID());

       merchantStocksRepository.save((oldMerchantStock));
        return true;
    }


    // delete merchant stock information
    public boolean deleteMerchantStock(Integer merchantStockID){

        MerchantStock merchantStock = merchantStocksRepository.getById(merchantStockID);
        if (merchantStock == null){
            return false;
        }

        merchantStocksRepository.delete(merchantStock);
        return true;
    }


    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
