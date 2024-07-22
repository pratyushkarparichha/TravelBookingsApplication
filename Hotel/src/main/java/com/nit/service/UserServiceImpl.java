package com.nit.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nit.exception.UserAlreadyExistsException;
import com.nit.model.Role;
import com.nit.model.User;
import com.nit.repository.IRoleRepository;
import com.nit.repository.IUserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private IRoleRepository roleRepository;

	@Override
	public User registerUser(User user) {
		 if (userRepository.existsByEmail(user.getEmail())){
	            throw new UserAlreadyExistsException(user.getEmail() + " already exists");
	        }
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        System.out.println(user.getPassword());
	        Role userRole = roleRepository.findByName("ROLE_USER").get();
	        user.setRoles(Collections.singletonList(userRole));
	        return userRepository.save(user);
	    }

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Transactional
	@Override
	public void deleteUser(String email) {
		User theUser = getUser(email);
        if (theUser != null){
            userRepository.deleteByEmail(email);
        }
	}

	@Override
	public User getUser(String email) {
		return userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
