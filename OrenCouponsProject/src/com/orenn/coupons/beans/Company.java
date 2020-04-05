package com.orenn.coupons.beans;
import com.orenn.coupons.enums.IndustryType;

public class Company {
	
	private long id;
	private String name;
	private String phoneNumber;
	private String address;
	private IndustryType industry;
	
	public Company(long id, String name, String phoneNumber, String address, IndustryType industry) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.industry = industry;
	}
	
	public Company(String name, String phoneNumber, String address, IndustryType industry) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.industry = industry;
	}

	public Company() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public IndustryType getIndustry() {
		return industry;
	}

	public void setIndustry(IndustryType industry) {
		this.industry = industry;
	}
	
}
