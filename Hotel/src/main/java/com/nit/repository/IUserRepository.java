package com.nit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	
	 boolean existsByEmail(String email);
	 
	 void deleteByEmail(String email);
	 
	 Optional<User> findByEmail(String email);

}
