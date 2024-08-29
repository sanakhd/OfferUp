package com.offerup.AccountsService.Services;

import com.offerup.AccountsService.DataTransferObjects.LoginCredentials;
import com.offerup.AccountsService.DataTransferObjects.User;
import com.offerup.AccountsService.DatabaseAccessors.AccountsDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.AccessDeniedException;

@Service
public class LoginService {


    private AccountsDataBase dataBase;
    private TokenService tokenService;
    @Autowired
    public LoginService (AccountsDataBase db, TokenService tokenService){
        this.dataBase = db;
        this.tokenService = tokenService;
    }


//    public String login(LoginCredentials userLoginDTO) throws AccessDeniedException {
//        // retrieve the user from the database based on the email
//        User user = dataBase.findByEmail(userLoginDTO.getEmail());
//        // check if the user exists and the password is correct
//        if (user == null || !user.getPassword().equals(userLoginDTO.getPassword())) {
//            throw new AccessDeniedException("Invalid email or password");
//        }
//
//        String token =tokenService.createSessionToken(user);
//        // generate a JWT token
//
//        return token;
//    }


}
