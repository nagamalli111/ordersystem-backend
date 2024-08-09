package com.eshop.ordersystem.registration;

import com.eshop.ordersystem.user.Role;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {

  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Role role;
}