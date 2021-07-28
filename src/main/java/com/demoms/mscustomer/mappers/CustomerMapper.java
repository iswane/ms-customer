package com.demoms.mscustomer.mappers;

import com.demoms.mscustomer.dto.CustomerRequestDTO;
import com.demoms.mscustomer.dto.CustomerResponseDTO;
import com.demoms.mscustomer.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  // CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );

  Customer customerRequestDtoToCustomer(CustomerRequestDTO customerRequestDTO);

  CustomerResponseDTO customerToCustomerResponseDto(Customer customer);

}
