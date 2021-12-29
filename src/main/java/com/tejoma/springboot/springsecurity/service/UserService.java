package com.tejoma.springboot.springsecurity.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.tejoma.springboot.springsecurity.model.User;
import com.tejoma.springboot.springsecurity.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
