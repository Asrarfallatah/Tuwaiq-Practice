package org.example.customer.Service;


import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiException;
import org.example.customer.Model.Customer;
import org.example.customer.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {


    private final CustomerRepository customerRepository;

    // get all customers from database
    public List<Customer> getAllCustomers(){

        // check if there are no customers in database
        if (customerRepository.findAll().isEmpty()){
            throw new ApiException("error there are no customers in the database yet to show their information's ! ");
        }

        return customerRepository.findAll();
    }

    // add a customer to database
    public void addCustomer (Customer customer){

        // check for null values
        if (customer.getName() == null || customer.getName().isEmpty()){
            throw new ApiException("error customer name can not be empty !");
        }

        // check input mismatch
        if (customer.getName().matches(".*\\d.*")){
            throw new ApiException("error customer name can not contain numbers !");
        }

        // add it
        customerRepository.save(customer);

    }

    // update a customer in database
    public void updateCustomer (Integer customerId , Customer customer){


        // check for null values
        if (customer.getName() == null || customer.getName().isEmpty()){
            throw new ApiException("error customer name can not be empty !");
        }
        if (customerId == null){
            throw new ApiException("error customer id can not be null !");
        }

        // check input mismatch
        if (customer.getName().matches(".*\\d.*")){
            throw new ApiException("error customer name can not contain numbers !");
        }
        if ( !(customerId.toString().matches(".*\\d.*")) ) {
            throw new ApiException("error customer id must be an integer number only !");
        }

        // check if customer exists
        Customer oldCustomer = customerRepository.findCustomerByCustomerId(customerId);
        if (oldCustomer == null){
            throw new ApiException("error no customer with that id ("+ customerId +") is found in the database !");
        }

        // update
        oldCustomer.setName(customer.getName());

        // save it
        customerRepository.save(customer);

    }

    // delete a customer from database
    public void deleteCustomer (Integer customerId){


        // check for null values
        if (customerId == null){
            throw new ApiException("error customer id can not be null !");
        }

        // check input mismatch
        if ( !(customerId.toString().matches(".*\\d.*")) ) {
            throw new ApiException("error customer id must be an integer number only !");
        }

        // check if customer exists
        Customer customer = customerRepository.findCustomerByCustomerId(customerId);
        if (customer == null){
            throw new ApiException("error no customer with that id ("+ customerId +") is found in the database !");
        }

        // delete it
        customerRepository.delete(customer);

    }








}
