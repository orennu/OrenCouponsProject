package com.orenn.coupons.beans;
import com.orenn.coupons.enums.UserType;

public class User {
	
	private long userId;
	private String userName;
	private String password;
	private long companyId;
	private UserType type;
	
	public User(long userId, String userName, String password, Long companyId, UserType type) {
		this.userId = userId;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", companyId="
				+ companyId + ", type=" + type + "]";
	}
	
}
