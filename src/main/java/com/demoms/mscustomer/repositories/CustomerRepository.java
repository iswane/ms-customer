package com.demoms.mscustomer.repositories;

import com.demoms.mscustomer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
