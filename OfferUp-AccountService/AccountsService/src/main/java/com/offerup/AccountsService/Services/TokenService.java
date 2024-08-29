package com.offerup.AccountsService.Services;


import com.offerup.AccountsService.DataTransferObjects.LoginCredentials;
import com.offerup.AccountsService.DataTransferObjects.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    @Value("${clientSecret}")
    private String client_secret;


    /*
    Create Token for login credentials
     */
    public String createSessionToken (User user){
        String token = Jwts.builder()
                .setSubject(user.getUsername().toString())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 24 hours
                .signWith(SignatureAlgorithm.HS512, client_secret)
                .compact();

        return token;
    }


}
