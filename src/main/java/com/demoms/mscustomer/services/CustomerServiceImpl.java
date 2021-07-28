package com.demoms.mscustomer.services;

import com.demoms.mscustomer.dto.CustomerRequestDTO;
import com.demoms.mscustomer.dto.CustomerResponseDTO;
import com.demoms.mscustomer.entities.Customer;
import com.demoms.mscustomer.mappers.CustomerMapper;
import com.demoms.mscustomer.repositories.CustomerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

  private CustomerRepository customerRepository;
  private CustomerMapper customerMapper;

  public CustomerServiceImpl(
      CustomerRepository customerRepository,
      CustomerMapper customerMapper) {
    this.customerRepository = customerRepository;
    this.customerMapper = customerMapper;
  }

  @Override
  public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
    Customer customer = customerMapper.customerRequestDtoToCustomer(customerRequestDTO);
    Customer customerSaved = customerRepository.save(customer);
    return customerMapper
        .customerToCustomerResponseDto(customerSaved);
  }

  @Override
  public CustomerResponseDTO getCustomer(String id) {
    Customer customer = customerRepository.getById(id);
    return customerMapper.customerToCustomerResponseDto(customer);
  }

  @Override
  public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
    Customer customer = customerMapper.customerRequestDtoToCustomer(customerRequestDTO);
    Customer customerUpdated = customerRepository.save(customer);
    return customerMapper
        .customerToCustomerResponseDto(customerUpdated);
  }

  @Override
  public List<CustomerResponseDTO> getAllCustomer() {
    List<Customer> customers = customerRepository.findAll();
    return customers.stream()
        .map(customer -> customerMapper
        .customerToCustomerResponseDto(customer))
        .collect(Collectors.toList());
  }
}
