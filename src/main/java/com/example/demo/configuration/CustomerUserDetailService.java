package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.entity.student;
import com.example.demo.repository.studentRepo;

@Component
public class CustomerUserDetailService implements UserDetailsService {
	
	@Autowired
	private studentRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		student s=repo.findByEmail(username);
		if(s==null) {
			throw new UsernameNotFoundException("username not found");
		}
		else {
			return new CustomUser(s);		}
	}
	
	
	

}
