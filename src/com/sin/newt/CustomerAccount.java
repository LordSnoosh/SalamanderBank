package com.sin.newt;

import java.util.UUID;

public class CustomerAccount {

    private String name;

    public CustomerAccount(String name){
        customerAccountId = UUID.randomUUID();
        this.name = name;
    }

    private UUID customerAccountId;

    public UUID getCustomerAccountId() { return customerAccountId; }

    public String getName() { return name; }


}
