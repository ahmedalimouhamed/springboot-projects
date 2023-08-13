package com.zerzif.springboot.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.zerzif.springboot.models.User;
import com.zerzif.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
