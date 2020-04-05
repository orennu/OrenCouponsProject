package com.orenn.coupons.beans;
import com.orenn.coupons.enums.UserType;

public class User {
	
	private long id;
	private String userName;
	private String password;
	private long companyId;
	private UserType type;
	
	public User(long id, String userName, String password, Long companyId, UserType type) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.companyId = companyId;
		this.type = type;
	}

	public User(String userName, String password, Long companyId, UserType type) {
		this.userName = userName;
		this.password = password;
		this.companyId = companyId;
		this.type = type;
	}
	
	public User() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
	
}
