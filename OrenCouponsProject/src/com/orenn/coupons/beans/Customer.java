package com.orenn.coupons.beans;
import java.util.Date;

public class Customer {
	
	private long id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String address;
	private String phoneNumber;
	private Date dateOfBirth;
	
	public Customer(long id, String firstName, String lastName, String address, String phoneNumber, Date dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public Customer(String firstName, String lastName, String address, String phoneNumber, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public Customer() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
