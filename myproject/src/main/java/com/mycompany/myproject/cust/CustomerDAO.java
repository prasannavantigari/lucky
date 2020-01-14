package com.mycompany.myproject.cust;

import java.sql.SQLException;
public interface CustomerDAO {

	public Customer createCustomer(String firstName,String lastName,String email) throws SQLException;

}
