package com.orenn.coupons.beans;
import java.util.Date;
import com.orenn.coupons.enums.CouponCategory;

public class Coupon {
	
	private long id;
	private String name;
	private String description;
	private long companyId;
	private float price;
	private CouponCategory category;
	private Date expirationDate;
	
	public Coupon(long id, String name, String description, long companyId, float price, CouponCategory category,
			Date expirationDate) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.companyId = companyId;
		this.price = price;
		this.category = category;
		this.expirationDate = expirationDate;
	}

	public Coupon(String name, String description, long companyId, float price, CouponCategory category,
			Date expirationDate) {
		this.name = name;
		this.description = description;
		this.companyId = companyId;
		this.price = price;
		this.category = category;
		this.expirationDate = expirationDate;
	}

	public Coupon() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public CouponCategory getCategory() {
		return category;
	}

	public void setCategory(CouponCategory category) {
		this.category = category;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
