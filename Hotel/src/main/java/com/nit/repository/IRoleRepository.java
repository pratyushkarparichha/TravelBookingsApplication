package com.nit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {
	
	 Optional<Role> findByName(String role);
	 
	 boolean existsByName(String role);

}
