package com.orenn.coupons.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
		String phoneRegex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
		Pattern phonePattern = Pattern.compile(phoneRegex);
		Matcher matcher = phonePattern.matcher(phoneNumber);
		
		return matcher.matches();
	}
	
	public static boolean isValidEmailAddress(String email) {
		String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher matcher = emailPattern.matcher(email);
		
		return matcher.matches();
	}
	
	public static boolean isValidUrl(String url) {
		String urlRegex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern urlPattern = Pattern.compile(urlRegex);
		Matcher matcher = urlPattern.matcher(url);
		
		return matcher.matches();
	}
	
	public static boolean isValidLength(String str, int min, int max) {
		if (str.length() >= min && str.length() <= max) {
			return true;
		}
		
		return false;
	}
	
	public static String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}

}
