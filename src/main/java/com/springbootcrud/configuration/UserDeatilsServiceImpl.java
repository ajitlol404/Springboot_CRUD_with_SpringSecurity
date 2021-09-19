package com.springbootcrud.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springbootcrud.entity.user;
import com.springbootcrud.repository.UserRepository;

public class UserDeatilsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		user user=userRepository.getUserByUsername(username);
		if (user==null) {
			throw new UsernameNotFoundException("Could Not find user");
		}
		return new MyUserDetails(user);
	}

}
