package org.example.customer.Service;


import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiException;
import org.example.customer.DTO.BranchDTO;
import org.example.customer.Model.Branch;
import org.example.customer.Model.Merchant;
import org.example.customer.Repository.BranchRepository;
import org.example.customer.Repository.MerchantRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchRepository branchRepository;
    private final MerchantRepository merchantRepository;

    // get
    public List<Branch> getAllBranch() {

        // is empty
        if (branchRepository.findAll().isEmpty()) {
            throw new ApiException("error there are no branches in the database yet to show their information's ! ");
        }

        return branchRepository.findAll();
    }

    // add
    public void addBranch(Integer merchant_id, Branch branch){

        // check merchant id
        Merchant merchant = merchantRepository.findMerchantByMerchantId(merchant_id);
            if(merchant ==null){
            throw new ApiException("error no merchant with this id exists !");
        }

        branch.setMerchant(merchant);
        branchRepository.save(branch);


    }

//    // 2nd way to add branch
//    public void addBranch(Branch branch){
//
//        branchRepository.save(branch);
//
//    }
//
//    public void assignMerchantToBranch(Integer merchant_id, Integer branch_id){
//
//
//        Merchant merchant = merchantRepository.findMerchantByMerchantId(merchant_id);
//        Branch branch = branchRepository.findBranchByBranchId(branch_id);
//
//        if (branch == null || merchant == null){
//            throw new ApiException("error can not assign merchant to branch because one of them does not exist !");
//        }
//
//
//        branch.setMerchant(merchant);
//        branchRepository.save(branch);
//
//
//    }


    // update

    public void updateBranch (Integer branchId , Branch branch){

        // find the branch
        Branch oldBranch = branchRepository.findBranchByBranchId(branchId);
        if (oldBranch == null){
            throw new ApiException("error branch with id "+ branchId +" not found !");
        }

        // update it
        oldBranch.setArea(branch.getArea());
        oldBranch.setNumber(branch.getNumber());

        branchRepository.save(oldBranch);

    }


    // delete
    public void deleteBranch (Integer branchId){

        // find the branch
        Branch branch = branchRepository.findBranchByBranchId(branchId);
        if (branch == null){
            throw new ApiException("error branch with id "+ branchId +" not found !");
        }

        branchRepository.delete(branch);

    }

    ///  extra endpoint

    // see a selected info about all branches (only area)
    public List<BranchDTO>  getBranches (){

        List<Branch> branches = branchRepository.findAll();

        ArrayList<BranchDTO> branchDTOS = new ArrayList<>();
        for (Branch branch : branches ) {

           int  counter = 0;

           branchDTOS.add(new BranchDTO(branch.getArea() , counter++));
        }

        return branchDTOS;
    }

    // 2- get all branches in a specific city
    public List<Branch> getBranchesInCity (String city) {

        List<Branch> branchesInCity = branchRepository.findBranchesByCity(city);
        if (branchesInCity.isEmpty()){
            throw new ApiException("error there are no branches in the city of "+ city +" !");
        }

        return branchesInCity;

    }

    // 3 - using branchDTO see for each area how many branches are there
    public List<BranchDTO> getBranchCountByArea (){

        List<Branch> branches = branchRepository.findAll();
        if (branches.isEmpty()){
            throw new ApiException("error there are no branches in the database yet to show their information's ! ");
        }

        // count branches by area
        ArrayList<BranchDTO> branchDTOS = new ArrayList<>();
        for (Branch branch : branches) {
            String area = branch.getArea();
            boolean areaExists = false;

            for (BranchDTO branchDTO : branchDTOS) {
                if (branchDTO.getArea().equals(area)) {
                    branchDTO.setCount(branchDTO.getCount() + 1);
                    areaExists = true;
                    break;
                }
            }

            if (!areaExists) {
                BranchDTO newBranchDTO = new BranchDTO(area , 0);
                newBranchDTO.setCount(1);
                branchDTOS.add(newBranchDTO);
            }
        }

        return branchDTOS;
    }


}
