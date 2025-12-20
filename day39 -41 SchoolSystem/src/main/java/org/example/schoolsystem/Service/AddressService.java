package org.example.schoolsystem.Service;


import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiException;
import org.example.schoolsystem.DTO.AddressDTO;
import org.example.schoolsystem.Model.Address;
import org.example.schoolsystem.Repository.AddressRepository;
import org.example.schoolsystem.Repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final TeacherRepository teacherRepository;


    // get all addresses from the database
    public List<Address> getAllAddresses(){

        // check if there is an address in the database
        if (addressRepository.findAll().isEmpty()){
            throw new ApiException("error there is no addresses in the database yet to show their information's ! ");
        }

        return addressRepository.findAll();
    }

    // add an address to the database
    public void addAddress(AddressDTO addressDTO){



        // check if teacher is there
        if (teacherRepository.findTeacherByTeacherId(addressDTO.getTeacherId()) == null){
            throw new ApiException("error no teacher with that id ("+ addressDTO.getTeacherId() +") is found in the database !");
        }

        // check if address is already exist
        Address address = new Address(addressDTO.getTeacherId() , addressDTO.getArea() , addressDTO.getStreet() , addressDTO.getBuildingNumber() , teacherRepository.findTeacherByTeacherId(addressDTO.getTeacherId()));
        if (addressRepository.findAddressByAddressId(address.getAddressId()) != null){
            throw new ApiException("error this address with that id ("+ address.getAddressId() +") is already exist in the database !");
        }

        // check if address is already exist
        if (addressRepository.findAddressByAddressId(address.getAddressId()) != null){
            throw new ApiException("error this address with that id ("+ address.getAddressId() +") is already exist in the database !");
        }

        // save it
        addressRepository.save(address);

    }

    // update an address in the database
    public void updateAddress(AddressDTO addressDTO) {

        // check if teacher is there
        if (teacherRepository.findTeacherByTeacherId(addressDTO.getTeacherId()) == null) {
            throw new ApiException("error no teacher with that id (" + addressDTO.getTeacherId() + ") is found in the database !");
        }

        // check if old address is there
        Address oldAddress = addressRepository.findAddressByAddressId(addressDTO.getTeacherId());
        if (oldAddress == null) {
            throw new ApiException("error no old address with that id is found in the database !");
        }

        // update it
        oldAddress.setArea(addressDTO.getArea());
        oldAddress.setStreet(addressDTO.getStreet());
        oldAddress.setBuildingNumber( addressDTO.getBuildingNumber() );

        // save it
        addressRepository.save(oldAddress);

    }

    // delete an address from the database

    public void deleteAddress(Integer addressId){


        // check if address is there
        Address address = addressRepository.findAddressByAddressId(addressId);
        if (address == null){
            throw new ApiException("error no address with that id ("+ addressId +") is found in the database !");
        }

        // delete it
        addressRepository.delete(address);

    }




}
