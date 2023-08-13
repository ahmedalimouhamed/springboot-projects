package com.zerzif.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zerzif.springboot.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
