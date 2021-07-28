package com.demoms.mscustomer;

import com.demoms.mscustomer.dto.CustomerRequestDTO;
import com.demoms.mscustomer.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsCustomerApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsCustomerApplication.class, args);
  }

  @Bean
  CommandLineRunner start(CustomerService customerService){
    return args -> {
      customerService.save(new CustomerRequestDTO("C01","ms-customer-1","customer1@customer.com"));
      customerService.save(new CustomerRequestDTO("C02","ms-customer-2","customer2@customer.com"));
      customerService.save(new CustomerRequestDTO("C03","ms-customer-3","customer3@customer.com"));
    };
  }

}
