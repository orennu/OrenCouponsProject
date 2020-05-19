package com.orenn.coupons.logic;

import java.util.Date;
import java.util.List;

import com.orenn.coupons.beans.Customer;
import com.orenn.coupons.dao.interfaces.ICustomersDao;
import com.orenn.coupons.enums.ErrorType;
import com.orenn.coupons.exceptions.ApplicationException;
import com.orenn.coupons.utils.DateUtils;
import com.orenn.coupons.utils.StringUtils;
import com.orenn.coupons.utils.ValidationsUtils;

public class CustomersController {
	
	private ICustomersDao customersDao;
	private UsersController userController;
	
	public CustomersController() {
	}
	
	public void addCustomer(Customer customer) throws ApplicationException {
		if (!isCustomerAttributesValid(customer)) {
			throw new ApplicationException();
		}
		if (this.customersDao.isCustomerExists(customer.getUser().getId())) {
			throw new ApplicationException(ErrorType.ALREADY_EXISTS_ERROR, 
										String.format("Customer with id %s %s", 
												customer.getUser().getId(), ErrorType.ALREADY_EXISTS_ERROR.getErrorDescription()));
		}
		
		customer.setFirstName(StringUtils.capitalize(customer.getFirstName()));
		customer.setLastName(StringUtils.capitalize(customer.getLastName()));
		long userId = this.userController.addUser(customer.getUser());

		this.customersDao.addCustomer(customer, userId);
	}
	
	public boolean isCustomerExists(long customerId) throws ApplicationException {
		if (!this.customersDao.isCustomerExists(customerId)) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
										String.format("Customer id %s %s", customerId, ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		
		return true;
	}
	
	public Customer getCustomerById(long customerId) throws ApplicationException {
		if (!this.customersDao.isCustomerExists(customerId)) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
										String.format("Customer id %s %s", customerId, ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		
		return this.customersDao.getCustomerById(customerId);
	}
	
	public List<Customer> getAllCustomers() throws ApplicationException {
		return this.customersDao.getAllCustomers();
	}
	
	public List<Customer> getBirthDayCustomers(Date dateOfBirth) throws ApplicationException {
		if (dateOfBirth.after(new Date())) {
			throw new ApplicationException(ErrorType.INVALID_DATE_ERROR, 
										String.format("%s, birth date cannot be in the future", ErrorType.INVALID_DATE_ERROR.getErrorDescription()));
		}
		if (DateUtils.calculateAge(dateOfBirth) < 18) {
			throw new ApplicationException(ErrorType.INVALID_DATE_ERROR, 
										String.format("%s, customer must be 18 years old or older", ErrorType.INVALID_DATE_ERROR.getErrorDescription()));
		}
		
		return this.customersDao.getBirthDayCustomers(dateOfBirth);
	}
	
	public void updateCustomer(Customer customer) throws ApplicationException {
		if (!isCustomerAttributesValid(customer)) {
			throw new ApplicationException();
		}
		if (!this.customersDao.isCustomerExists(customer.getUser().getId())) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
										String.format("Customer id %s %s", customer.getUser().getId(), ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		
		customer.setFirstName(StringUtils.capitalize(customer.getFirstName()));
		customer.setLastName(StringUtils.capitalize(customer.getLastName()));
		
		this.customersDao.updateCustomer(customer);
	}
	
	public void removeCustomer(Customer customer) throws ApplicationException {
		if (!this.customersDao.isCustomerExists(customer.getUser().getId())) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
										String.format("Customer id %s %s", customer.getUser().getId(), ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		
		this.customersDao.removeCustomer(customer.getUser().getId());
	}
	
	private boolean isCustomerAttributesValid(Customer customer) throws ApplicationException {
		if (customer == null) {
			throw new ApplicationException(ErrorType.NULL_ERROR, String.format("%s Customer", ErrorType.NULL_ERROR.getErrorDescription()));
		}
		if (!ValidationsUtils.isValidLength(customer.getFullName(), 3, 30)) {
			throw new ApplicationException(ErrorType.INVALID_LENGTH_ERROR, 
										String.format("%s, customer name must be between 3-30 characters", ErrorType.INVALID_LENGTH_ERROR.getErrorDescription()));
		}
		if (!ValidationsUtils.isValidName(customer.getFirstName())) {
			throw new ApplicationException();
		}
		if (!ValidationsUtils.isValidName(customer.getLastName())) {
			throw new ApplicationException();
		}
		if (!ValidationsUtils.isValidPhoneNumber(customer.getPhoneNumber())) {
			throw new ApplicationException(ErrorType.INVALID_FORMAT_ERROR, 
										String.format("%s, phone number must be 6 - 14 digits", ErrorType.INVALID_FORMAT_ERROR.getErrorDescription()));
		}
		if (!ValidationsUtils.isValidAddress(customer.getAddress())) {
			throw new ApplicationException(ErrorType.INVALID_FORMAT_ERROR, 
										String.format("%s in address", ErrorType.INVALID_FORMAT_ERROR.getErrorDescription()));
		}
		if (customer.getDateOfBirth().after(new Date())) {
			throw new ApplicationException(ErrorType.INVALID_DATE_ERROR, 
										String.format("%s, birth date cannot be in the future", ErrorType.INVALID_DATE_ERROR.getErrorDescription()));
		}
		if (DateUtils.calculateAge(customer.getDateOfBirth()) < 18) {
			throw new ApplicationException(ErrorType.INVALID_DATE_ERROR, 
										String.format("%s, customer must be 18 years old or older", ErrorType.INVALID_DATE_ERROR.getErrorDescription()));
		}
		
		return true;
	}

}
