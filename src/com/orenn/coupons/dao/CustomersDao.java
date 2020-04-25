package com.orenn.coupons.dao;

import com.orenn.coupons.beans.Customer;

public class CustomersDao {

	public void addCustomer(Customer customer) {
		System.out.println("customer " + customer.getFullName() + " added");
	}

	public void updateCustomer(Customer customer) {
		System.out.println("customer updated");
	}

	public void removeCustomer(long customerId) {
		System.out.println("customer removed");
	}

	public boolean isCustomerExists(long customerId) {
		return false;
	}

}
