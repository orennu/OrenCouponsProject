package com.orenn.coupons.logic;

import com.orenn.coupons.utils.StringUtils;
import com.orenn.coupons.utils.ValidationsUtils;

import java.util.List;

import com.orenn.coupons.beans.Company;
import com.orenn.coupons.dao.CompaniesDao;
import com.orenn.coupons.enums.ErrorType;
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
		if (this.companiesDao.isCompanyExists(company.getName())) {
			throw new ApplicationException(ErrorType.ALREADY_EXISTS_ERROR, 
					String.format("Company %s %s", company.getName(), ErrorType.ALREADY_EXISTS_ERROR.getErrorDescription()));
		}
		
		company.setName(StringUtils.capitalize(company.getName()));
		
		return this.companiesDao.addCompany(company);
	}
	
	public boolean isCompanyExists(long companyId) throws ApplicationException {
		if (!this.companiesDao.isCompanyExists(companyId)) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
					String.format("Company id %s %s", companyId, ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		
		return true;
	}
	
	public Company getCompanyById(long companyId) throws ApplicationException {
		if (!this.companiesDao.isCompanyExists(companyId)) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
					String.format("Company id %s %s", companyId, ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		
		return this.companiesDao.getCompanyById(companyId);
	}
	
	public List<Company> getAllCompanies() throws ApplicationException {
		return this.companiesDao.getAllCompanies();
	}
	
	public void updateCompany(Company company) throws ApplicationException {
		if (!this.companiesDao.isCompanyExists(company.getId())) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
					String.format("Company id %s %s", company.getId(), ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		if (!isCompanyAttributesValid(company)) {
			throw new ApplicationException();
		}
		
		company.setName(StringUtils.capitalize(company.getName()));
		
		this.companiesDao.updateCompany(company);
	}
	
	public void removeCompany(long companyId) throws ApplicationException {
		if (!this.companiesDao.isCompanyExists(companyId)) {
			throw new ApplicationException(ErrorType.NOT_EXISTS_ERROR, 
					String.format("Company id %s %s", companyId, ErrorType.NOT_EXISTS_ERROR.getErrorDescription()));
		}
		
		this.companiesDao.removeCompany(companyId);
	}
	
	private boolean isCompanyAttributesValid(Company company) throws ApplicationException {
		if (company == null) {
			throw new ApplicationException(ErrorType.NULL_ERROR, String.format("%s company", ErrorType.NULL_ERROR.getErrorDescription()));
		}
		if (this.companiesDao.isCompanyEmailExists(company.getEmail())) {
			throw new ApplicationException(ErrorType.ALREADY_EXISTS_ERROR, 
					String.format("Company with email %s %s", company.getEmail(), ErrorType.ALREADY_EXISTS_ERROR.getErrorDescription()));
		}
		if (!ValidationsUtils.isValidEmail(company.getEmail())) {
			throw new ApplicationException(ErrorType.INVALID_FORMAT_ERROR, 
					String.format("%s in email address", ErrorType.INVALID_FORMAT_ERROR.getErrorDescription()));
		}
		if (this.companiesDao.isCompanyPhoneNumberExists(company.getPhoneNumber())) {
			throw new ApplicationException(ErrorType.ALREADY_EXISTS_ERROR, 
					String.format("Company with phone number %s %s", company.getPhoneNumber(), ErrorType.ALREADY_EXISTS_ERROR.getErrorDescription()));
		}
		if (!ValidationsUtils.isCompanyNameValid(company.getName())) {
			throw new ApplicationException();
		}
		if (!ValidationsUtils.isValidPhoneNumber(company.getPhoneNumber())) {
			throw new ApplicationException(ErrorType.INVALID_FORMAT_ERROR, 
					String.format("%s, phone number must be 6 - 14 digits", ErrorType.INVALID_FORMAT_ERROR.getErrorDescription()));
		}
		if (!ValidationsUtils.isValidAddress(company.getAddress())) {
			throw new ApplicationException(ErrorType.INVALID_CHARS_ERROR, String.format("%s in address", ErrorType.INVALID_CHARS_ERROR.getErrorDescription()));
		}
		
		return true;
	}
	
}
