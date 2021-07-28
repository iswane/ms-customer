package com.demoms.mscustomer.services;

import com.demoms.mscustomer.dto.CustomerRequestDTO;
import com.demoms.mscustomer.dto.CustomerResponseDTO;
import java.util.List;

public interface CustomerService {

  CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
  CustomerResponseDTO getCustomer(String id);
  CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
  List<CustomerResponseDTO> getAllCustomer();
}
