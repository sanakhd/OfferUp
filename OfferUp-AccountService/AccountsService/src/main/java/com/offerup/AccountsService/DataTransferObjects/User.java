package com.offerup.AccountsService.DataTransferObjects;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
//@Document("accounts")
public class User {


    public User(String email, String username, String firstName, String lastName, String password, Address address) {
        //super();
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        //this.address = address;
    }
    private String email;

    @Id
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    //private Address address;


}
