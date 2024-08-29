package com.offerup.AccountsService.DataTransferObjects;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String streetAddress;
    private String postalcode;
    private String city;
    private String province;
    private String country;

}
