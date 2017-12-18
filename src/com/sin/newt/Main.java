package com.sin.newt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomerAddress customerAddress1 = new CustomerAddress("123 east main","Seaside","Maine","98000" );

        Customer customer = new Customer("Bob ", "Belcher ");
        customer.customerAddress = customerAddress1;
        customer.customerAccount = new CustomerAccount("Checking Account ");
        customer.displayFullName();

        System.out.println("Customer 1 Address Id: " + customer.customerAddress.getCustomerAddressId());
        System.out.println("Customer Address: " + customer.customerAddress.getAddress());
        System.out.println("City: " + customer.customerAddress.getCity());
        System.out.println("State: " + customer.customerAddress.getState());
        System.out.println("Zip Code: " + customer.customerAddress.getZipCode());
        System.out.println("Account Name: " + customer.customerAccount.getName());
        System.out.println("Customer 1: " + customer.getCustomerId());
        System.out.println("Account Id: " + customer.customerAccount.getCustomerAccountId());

        //Start of customer 2


        Customer customer2 = new Customer("Linda ", "Belcher ");
        customer2.customerAddress = customerAddress1;
        customer2.customerAccount = new CustomerAccount("Checking Account ");
        customer2.displayFullName();

        System.out.println("Customer 2 Address Id: " + customer2.customerAddress.getCustomerAddressId());
        System.out.println("Account Name: " + customer2.customerAccount.getName());
        System.out.println("Customer Address: " + customer.customerAddress.getAddress());
        System.out.println("City: " + customer.customerAddress.getCity());
        System.out.println("State: " + customer.customerAddress.getState());
        System.out.println("Zip Code: " + customer.customerAddress.getZipCode());
        System.out.println("Customer 2: " + customer2.getCustomerId());
        System.out.println("Account Id: " + customer2.customerAccount.getCustomerAccountId());



    }

}
