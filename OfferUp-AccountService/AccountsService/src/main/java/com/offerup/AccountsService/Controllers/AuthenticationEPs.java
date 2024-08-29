package com.offerup.AccountsService.Controllers;


import com.offerup.AccountsService.DataTransferObjects.LoginCredentials;
import com.offerup.AccountsService.DataTransferObjects.User;
import com.offerup.AccountsService.DatabaseAccessors.AccountsDataBase;
import com.offerup.AccountsService.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth")
public class AuthenticationEPs {

    @Autowired
    private AccountsDataBase accountsDataBase;
    private LoginService loginService;


    @Autowired
    public AuthenticationEPs (LoginService loginService)
    {
        this.loginService = loginService;
    }



//    @PostMapping("/login")
//    public ResponseEntity<String> authenticateUser(@RequestBody LoginCredentials userCredentials) {
//
//        try{
//            String token = loginService.login(userCredentials);
//        } catch (AccessDeniedException e)
//        {
//
//        }
//
//
//            return null;
//    }

    @GetMapping("/test")
    @CrossOrigin(origins = "*")
    public String testing() {

        return "accountsDataBase.findAll()";

    }
}
