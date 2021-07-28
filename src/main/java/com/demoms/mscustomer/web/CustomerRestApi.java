package com.demoms.mscustomer.web;

import com.demoms.mscustomer.dto.CustomerRequestDTO;
import com.demoms.mscustomer.dto.CustomerResponseDTO;
import com.demoms.mscustomer.services.CustomerService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class CustomerRestApi {

  private CustomerService customerService;

  public CustomerRestApi(CustomerService customerService) {
    this.customerService = customerService;
  }

  @PostMapping(path = "customers")
  public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO){
    return customerService.save(customerRequestDTO);
  }

  @GetMapping(path = "customers/{id}")
  public CustomerResponseDTO getCustomer(@PathVariable String id){
    return customerService.getCustomer(id);
  }

  @PutMapping(path = "customers")
  public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO){
    return customerService.update(customerRequestDTO);
  }

  @GetMapping(path = "customers")
  public List<CustomerResponseDTO> getAllCustomer(){
    return customerService.getAllCustomer();
  }
}
