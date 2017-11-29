package com.auth.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import com.auth.model.JwtUser;

@Component
public class JwtValidator {


    private String secret = "Amruta";

    public JwtUser validate(String token) {

        JwtUser jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            jwtUser = new JwtUser();

            jwtUser.setUsername(body.getSubject());
            jwtUser.setUsername(((String) body.get("username")));
        
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return jwtUser;
    }
}
