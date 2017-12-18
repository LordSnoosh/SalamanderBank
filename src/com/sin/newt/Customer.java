package com.sin.newt;

import java.util.UUID;

public class Customer {

    public Customer(String firstName, String lastName) {
        setCustomerId(UUID.randomUUID());
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private UUID customerId;
    private String firstName;
    private String lastName;
    public CustomerAddress customerAddress;
    public CustomerAccount customerAccount;

    public UUID getCustomerId() {
        return customerId;
    }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    private void setCustomerId(UUID value) {
        customerId = value;
    }

    public void displayFullName() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
    }

}
