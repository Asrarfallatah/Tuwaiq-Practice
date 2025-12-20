package org.example.bankingmanagementsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.bankingmanagementsystem.Api.ApiException;
import org.example.bankingmanagementsystem.Model.Customer;
import org.example.bankingmanagementsystem.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        if (customerRepository.findAll().isEmpty()) {
            throw new ApiException("No customers found yet");
        }
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Integer id, Customer customer) {
        Customer oldCustomer = customerRepository.findCustomerById(id);
        if (oldCustomer == null) {
            throw new ApiException("Customer not found");
        }

        oldCustomer.setPhoneNUmber(customer.getPhoneNUmber());
        customerRepository.save(oldCustomer);
    }

    public void deleteCustomer(Integer id) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer == null) {
            throw new ApiException("Customer not found");
        }

        if (customer.getAccounts() != null && !customer.getAccounts().isEmpty()) {
            throw new ApiException("Cannot delete customer with existing accounts");
        }

        customerRepository.delete(customer);
    }
}

