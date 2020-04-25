package com.orenn.coupons;

import java.lang.reflect.Field;
import java.time.LocalDate;

import com.orenn.coupons.beans.Company;
import com.orenn.coupons.enums.*;
import com.orenn.coupons.beans.Customer;
import com.orenn.coupons.exceptions.ApplicationException;
import com.orenn.coupons.logic.CompaniesController;
import com.orenn.coupons.logic.CustomersController;
import com.orenn.coupons.utils.Utils;

public class Tester {
	
	public static void main(String[] args) {
		LocalDate bday = LocalDate.of(1980, 4, 9);
//		Company company = new Company();
		Company company = new Company("the company", "+9724714514", "afafa", IndustryType.FOOD);
		CompaniesController cont = new CompaniesController();
//		
		try {
			cont.addCompany(company);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}
}
