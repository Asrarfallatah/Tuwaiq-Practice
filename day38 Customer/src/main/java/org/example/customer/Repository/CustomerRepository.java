package org.example.customer.Repository;


import org.example.customer.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Integer> {

    Customer findCustomerByCustomerId(Integer customerId);

}
