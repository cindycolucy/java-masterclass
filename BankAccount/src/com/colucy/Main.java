package com.colucy;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount("12345678", 1000.00, "Charlie Colucy", "charliecolucy@hotmail.com", "614-282-1117");

//	    account.setAccountNumber("12345678");
//	    account.setCustomerName("Charlie Colucy");
//	    account.setEmail("charliecolucy@hotmail.com");
//	    account.setPhoneNumber("614-282-1117");

		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Customer Name: " + account.getCustomerName());
		System.out.println("Email: " + account.getEmail());
		System.out.println("Phone Number: " + account.getPhoneNumber());

	    account.setBalance(1000.00);
        System.out.println("Balance: " + account.getBalance());
	    account.makeDeposit(100.50);
        System.out.println("Balance: " + account.getBalance());
	    account.makeWithdrawl(50.45);
        System.out.println("Balance: " + account.getBalance());

        VIPCustomer customer1 = new VIPCustomer();
		System.out.println("VIP Name: " + customer1.getName());
		System.out.println("VIP Credit Limit: " + customer1.getCreditLimit());
		System.out.println("VIP Email: " + customer1.getEmail());

		VIPCustomer customer2 = new VIPCustomer("Atticus Colucy", 15000);
		System.out.println("VIP Name: " + customer2.getName());
		System.out.println("VIP Credit Limit: " + customer2.getCreditLimit());
		System.out.println("VIP Email: " + customer2.getEmail());

		VIPCustomer customer3 = new VIPCustomer("Maxwell Colucy", 12000, "maxcolucy@icloud.com");
		System.out.println("VIP Name: " + customer3.getName());
		System.out.println("VIP Credit Limit: " + customer3.getCreditLimit());
		System.out.println("VIP Email: " + customer3.getEmail());
    }

}
