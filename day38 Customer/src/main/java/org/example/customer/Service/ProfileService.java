package org.example.customer.Service;


import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiException;
import org.example.customer.DTO.ProfileDTO;
import org.example.customer.Model.Customer;
import org.example.customer.Model.Profile;
import org.example.customer.Repository.CustomerRepository;
import org.example.customer.Repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final CustomerRepository customerRepository;
    private final ProfileRepository profileRepository;


    // get all profiles from database
    public List<Profile> getAllProfile(){

        // check if empty
        if (profileRepository.findAll().isEmpty()){
            throw new ApiException("error there are no profiles in the database yet to show their information's ! ");
        }

        return profileRepository.findAll();
    }

    // add a profile to database
    public void addProfile (ProfileDTO profileDTO){

        // check if customer is there
        Customer checkcustomer = customerRepository.findCustomerByCustomerId(profileDTO.getCustomerId());
        if (checkcustomer == null){
            throw new ApiException("error no customer with that id ("+ profileDTO.getCustomerId() +") is found in the database !");
        }

        // check if profile is already exist
        Profile profile = new Profile(profileDTO.getCustomerId() , profileDTO.getAge() , profileDTO.getEmail() , profileDTO.getAddress() , profileDTO.getPhoneNumber() , checkcustomer);
        if (profileRepository.findProfileByProfileId(profile.getProfileId()) != null){
            throw new ApiException("error this profile with that id ("+ profile.getProfileId() +") is already exist in the database !");
        }

        // save it
        profileRepository.save(profile);

    }

    // update a profile in database
    public void updateProfile(ProfileDTO profileDTO){


        // check if profile is there
        Profile profile = profileRepository.findProfileByProfileId(profileDTO.getCustomerId());
        if (profile == null){
            throw new ApiException("error no profile with that id is found in the database !");
        }


        // update it
        profile.setAge(profileDTO.getAge());
        profile.setEmail(profileDTO.getEmail());
        profile.setAddress(profileDTO.getAddress());
        profile.setPhoneNumber(profileDTO.getPhoneNumber());
        profile.setProfileId(profileDTO.getCustomerId());

        // save it
        profileRepository.save(profile);

    }



    // delete a profile from database
    public void deleteProfile(Integer profileId){

        // check if profileId is a number
        if (!(profileId.toString().matches(".*\\d.*"))){
            throw new ApiException("error profile id can not have a strings ! ");
        }

        // check if profile is there
        Profile profile = profileRepository.findProfileByProfileId(profileId);
        if (profile == null){
            throw new ApiException("error no profile with that id ("+ profileId +") is found in the database !");
        }

        // check if customer is there
        Customer checkcustomer = customerRepository.findCustomerByCustomerId(profileId);
        if (checkcustomer == null){
            throw new ApiException("error no customer with that id ("+ profileId +") is found in the database !");
        }


        // save it
        profileRepository.save(profile);

    }


}
