package com.orenn.coupons.dao;

import com.orenn.coupons.beans.Company;

public class CompaniesDao {
	
	public void addCompany(Company company) {
		System.out.println("company " + company.getCompanyName() + " added");
	}
	
	public void updateCompany(Company company) {
		System.out.println("company updated");
	}

	public void removeCompany(long companyId) {
		System.out.println("company removed");
	}
	
	public boolean isCompanyExists(String companyName) {
		return false;
	}
	
	public boolean isCompanyExists(long companyId) {
		return false;
	}

}
