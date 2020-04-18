package com.orenn.coupons.beans;
import java.time.LocalDate;

import com.orenn.coupons.utils.Utils;

public class Customer {
	
	private long customerId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String address;
	private String phoneNumber;
	private LocalDate dateOfBirth;
	
	public Customer(long customerId, String firstName, String lastName, String address, String phoneNumber, LocalDate dateOfBirth) {
		this.customerId = customerId;
		this.firstName = Utils.capitalize(firstName.trim());
		this.lastName = Utils.capitalize(lastName.trim());
		this.fullName = this.firstName + " " + this.lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public Customer(String firstName, String lastName, String address, String phoneNumber, LocalDate dateOfBirth) {
		this.firstName = Utils.capitalize(firstName.trim());
		this.lastName = Utils.capitalize(lastName.trim());
		this.fullName = this.firstName + " " + this.lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public Customer() {
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", fullName=" + fullName + ", address=" + address + ", phoneNumber=" + phoneNumber + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
	
}
