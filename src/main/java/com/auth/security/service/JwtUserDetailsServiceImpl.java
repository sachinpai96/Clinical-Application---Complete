package com.auth.security.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.auth.model.JwtUser;
import com.auth.security.repository.UserRepository;


@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails springUserRecord=null;
		JwtUser user = userRepository.findByUsernameIgnoreCase(username);
		
		

		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		 GrantedAuthority grantedAuthority=new SimpleGrantedAuthority("admin");
	        grantedAuthorities.add(grantedAuthority);
	        
		if(user!=null){
			springUserRecord = new User(
					user.getUsername(), user.getPassword(), true, false, false, false, grantedAuthorities);
			return springUserRecord;
		}else{
			return springUserRecord;	
		}
		
		
		
	}
}
