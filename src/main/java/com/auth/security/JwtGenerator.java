package com.auth.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.stereotype.Component;

import com.auth.model.JwtUser;

@Component
public class JwtGenerator {
	
    public String generate(JwtUser jwtUser) {


        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUsername());
       // claims.put("userId", String.valueOf(jwtUser.getUserId()));
        claims.put("username", String.valueOf(jwtUser.getUsername()));

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "Amruta")
                .compact();
    }
}
