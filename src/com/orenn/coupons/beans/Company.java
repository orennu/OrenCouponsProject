package com.orenn.coupons.beans;
import com.orenn.coupons.enums.IndustryType;

public class Company {
	
	private long companyId;
	private String companyName;
	private String phoneNumber;
	private String address;
	private IndustryType industry;
	
	public Company(long companyId, String companyName, String phoneNumber, String address, IndustryType industry) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.industry = industry;
	}
	
	public Company(String companyName, String phoneNumber, String address, IndustryType industry) {
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.industry = industry;
	}

	public Company() {
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", industry=" + industry + "]";
	}
	
}
