package com.mycompany.myproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.mycompany.myproject.cust.Customer;
import com.mycompany.myproject.cust.CustomerServiceImp1;

public class CustomerAPP {

	private static CustomerServiceImp1 service;
	static {
		service = new CustomerServiceImp1();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. create customer");
			System.out.println("2. display all customers");
			System.out.println("3. find customer by id");
			System.out.println("4. update customer");
			System.out.println("5. delete customer");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print(" First Name: ");
				String fName=br.readLine().toString();
				System.out.print(" Last Name: ");
				String lName=br.readLine().toString();
				System.out.print(" Email: ");
				String email=br.readLine().toString();
				Customer customer=service.createCustomer(fName, lName, email);
				System.out.println("Create Customer Sucess "+customer);
				break;
			case 0:
				System.exit(0);

			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}
}
