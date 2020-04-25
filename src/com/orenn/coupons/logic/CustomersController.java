package com.orenn.coupons.logic;

import java.time.LocalDate;

import com.orenn.coupons.beans.Customer;
import com.orenn.coupons.dao.CustomersDao;
import com.orenn.coupons.exceptions.ApplicationException;
import com.orenn.coupons.utils.Utils;

public class CustomersController {
	
	private CustomersDao customersDao;
	
	public CustomersController() {
		this.customersDao = new CustomersDao();
	}
	
	public void addCustomer(Customer customer) throws ApplicationException {
		if (!isCustomerAttributesValid(customer)) {
			throw new ApplicationException();
		}
		if (this.customersDao.isCustomerExists(customer.getCustomerId())) {
			throw new ApplicationException("customer already exists");
		}
		
		customer.setFirstName(Utils.capitalize(customer.getFirstName()));
		customer.setLastName(Utils.capitalize(customer.getLastName()));
		
		this.customersDao.addCustomer(customer);
	}

	public void updateCustomer(Customer customer) throws ApplicationException {
		if (!isCustomerAttributesValid(customer)) {
			throw new ApplicationException();
		}
		if (!this.customersDao.isCustomerExists(customer.getCustomerId())) {
			throw new ApplicationException("customer does not exists");
		}
		
		customer.setFirstName(Utils.capitalize(customer.getFirstName()));
		customer.setLastName(Utils.capitalize(customer.getLastName()));
		
		this.customersDao.updateCustomer(customer);
	}
	
	public void removeCustomer(long customerId) throws ApplicationException {
		if (!this.customersDao.isCustomerExists(customerId)) {
			throw new ApplicationException("customer does not exist");
		}
		
		this.customersDao.removeCustomer(customerId);
	}
	
	private boolean isCustomerAttributesValid(Customer customer) throws ApplicationException {
		if (customer == null) {
			throw new ApplicationException("customer is null");
		}
		if (!Utils.isValidLength(customer.getFullName(), 3, 30)) {
			throw new ApplicationException("invalid customer name length, must be between 3-30");
		}
		if (!isValidName(customer.getFirstName())) {
			throw new ApplicationException();
		}
		if (!isValidName(customer.getLastName())) {
			throw new ApplicationException();
		}
		if (!Utils.isValidPhoneNumber(customer.getPhoneNumber())) {
			throw new ApplicationException("invalid phone number");
		}
		if (customer.getAddress().length() == 0) {
			throw new ApplicationException("address cannot be empty");
		}
		if (customer.getDateOfBirth().isAfter(LocalDate.now().minusYears(18))) {
			throw new ApplicationException("customer must be 18 years old or older");
		}
		
		return true;
	}

	private boolean isValidName(String name) throws ApplicationException {
		String nameRegex = "^[\\p{L}.'-]+$";
		if (!Utils.isMatchingPattern(nameRegex, name)) {
			throw new ApplicationException("invalid name, must contain only valid name characters");
		}
		if (name.trim().length() < name.length()) {
			throw new ApplicationException("invalid name, cannot begin or end with whitespaces");
		}
		
		return true;
	}
	
}
