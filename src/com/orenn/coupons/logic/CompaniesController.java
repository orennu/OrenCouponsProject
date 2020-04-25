package com.orenn.coupons.logic;

import com.orenn.coupons.utils.Utils;

import com.orenn.coupons.beans.Company;
import com.orenn.coupons.dao.CompaniesDao;
import com.orenn.coupons.exceptions.ApplicationException;

public class CompaniesController {
	
	private CompaniesDao companiesDao;
	
	public CompaniesController() {
		this.companiesDao = new CompaniesDao();
	}
	
	public long addCompany(Company company) throws ApplicationException {
		if (!isCompanyAttributesValid(company)) {
			throw new ApplicationException();
		}
		if (this.companiesDao.isCompanyExists(company.getCompanyName())) {
			throw new ApplicationException("company " + company.getCompanyName() + " already exists");
		}
		
		company.setCompanyName(Utils.capitalize(company.getCompanyName()));
		
		return this.companiesDao.addCompany(company);
	}
	
	public boolean isCompanyExists(long companyId) throws ApplicationException {
		if (!this.companiesDao.isCompanyExists(companyId)) {
			throw new ApplicationException("company id does not exist");
		}
		
		return true;
	}
	
	public void updateCompany(Company company) throws ApplicationException {
		if (!isCompanyAttributesValid(company)) {
			throw new ApplicationException();
		}
		if (!this.companiesDao.isCompanyExists(company.getCompanyId())) {
			throw new ApplicationException("company does not exists");
		}
		
		this.companiesDao.updateCompany(company);
	}
	
	public void removeCompany(long companyId) throws ApplicationException {
		if (!this.companiesDao.isCompanyExists(companyId)) {
			throw new ApplicationException("company does not exists");
		}
		
		this.companiesDao.removeCompany(companyId);
	}
	
	private boolean isCompanyAttributesValid(Company company) throws ApplicationException {
		if (company == null) {
			throw new ApplicationException("company is null");
		}
		if (!Utils.isValidLength(company.getCompanyName(), 2, 20)) {
			throw new ApplicationException("invalid company name length, must be between 2-20");
		}
		if (!isCompanyNameValid(company.getCompanyName())) {
			throw new ApplicationException("invalid company name, can contain only letters, digits and white space");
		}
		if (!Utils.isValidPhoneNumber(company.getPhoneNumber())) {
			throw new ApplicationException("invalid phone number");
		}
		if (company.getAddress().length() == 0) {
			throw new ApplicationException("address cannot be empty");
		}
		
		return true;
	}
	private boolean isCompanyNameValid(String companyName) throws ApplicationException {
		String nameRegex = "[a-zA-Z0-9 ]+";
		
		if (!Utils.isMatchingPattern(nameRegex, companyName)) {
			throw new ApplicationException("invalid name, must contain only valid name characters");
		}
		
		if (companyName.trim().length() < companyName.length()) {
			throw new ApplicationException("invalid name, cannot begin or end with whitespaces");
		}
		
		return true;
	}
	
}
