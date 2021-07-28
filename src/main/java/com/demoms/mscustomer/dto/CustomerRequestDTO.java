package com.demoms.mscustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerRequestDTO {
  private String id;
  private String name;
  private String email;
}
