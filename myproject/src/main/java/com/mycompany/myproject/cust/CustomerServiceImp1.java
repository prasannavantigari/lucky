package com.mycompany.myproject.cust;


import java.sql.SQLException;


public class CustomerServiceImp1 implements CustomerService {

	
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImp1();
	}

	public Customer createCustomer(String FirstName, String LastName, String email) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(FirstName, LastName, email);
	}

}
