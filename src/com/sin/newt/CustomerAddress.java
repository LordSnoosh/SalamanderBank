package com.sin.newt;

import java.util.UUID;

public class CustomerAddress {

    public CustomerAddress(String address, String city, String state, String zipCode) {
        customerAddressId = UUID.randomUUID();
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }

    private UUID customerAddressId;

    public UUID getCustomerAddressId() { return customerAddressId; }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() { return state; }

    public String getZipCode() { return zipCode; }

    private String address;

    private String city;

    private String state;

    private String zipCode;



}
