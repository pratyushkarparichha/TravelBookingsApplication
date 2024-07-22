package com.nit.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nit.pojo.ERole;
import com.nit.pojo.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	Optional<Role> findByName(ERole name);

}
