package com.tejoma.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<com.tejoma.springboot.springsecurity.model.User, Long> {
	com.tejoma.springboot.springsecurity.model.User findByEmail(String email);
}
