package com.nit.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nit.model.User;
import com.nit.repository.IUserRepository;

@Service
public class HotelUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email)
														.orElseThrow(() -> new UsernameNotFoundException("User not found"));
		
        return HotelUserDetails.buildUserDetails(user);
	}


}
