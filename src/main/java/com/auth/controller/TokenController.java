package com.auth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.JwtUser;
import com.auth.security.JwtGenerator;

@RestController
@Component
public class TokenController {


    private JwtGenerator jwtGenerator;

    @Autowired
	private UserDetailsService userDetailsService;

    @Autowired
	private AuthenticationManager authenticationManager;

    
    @Value("${jwt.header}")
	private String tokenHeader;
    
    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @RequestMapping("/token")
    public String generate(@RequestBody final JwtUser jwtUser) {

        return jwtGenerator.generate(jwtUser);

    }
    
    @RequestMapping(value="/auth",method=RequestMethod.POST)
    public ResponseEntity<?> generate1(@RequestBody JwtUser jwtUser) {
    	System.out.println("in Auth");
    	System.out.println("in Auth:::"+jwtUser.getUsername());
    	System.out.println("in Auth:::"+jwtUser.getPassword());
    	  	
    	/*final Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtUser.getUsername(), jwtUser.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
*/
    	UserDetails userDetails =  userDetailsService.loadUserByUsername(jwtUser.getUsername());
		
		if(userDetails!=null){
			String token= jwtGenerator.generate(jwtUser);
	        
	        HttpHeaders headers = new HttpHeaders();
			headers.add(tokenHeader, token);
			return ResponseEntity.ok().headers(headers).body(userDetails);
			
		}else{
			return ResponseEntity.status(401).body("NOT AUTHENTICATED...!! ");
		}
    	
       

    }
}
