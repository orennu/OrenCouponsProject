package com.orenn.coupons;

import java.time.LocalDate;

import com.orenn.coupons.beans.Customer;

public class Tester {
	
	public static void main(String[] args) {
		LocalDate bday = LocalDate.of(1980, 4, 9);
		Customer customer = new Customer("", "  nu  ", "zahal 10", "1414", bday);
		
		System.out.println(customer.getFullName());
	}
}
