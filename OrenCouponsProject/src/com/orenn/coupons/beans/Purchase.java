package com.orenn.coupons.beans;
import java.util.Date;

public class Purchase {
	
	private long id;
	private long customerId;
	private long couponId;
	private Date purchaseDate;

	public Purchase(long id, long customerId, long couponId, Date purchaseDate) {
		this.id = id;
		this.customerId = customerId;
		this.couponId = couponId;
		this.purchaseDate = purchaseDate;
	}

	public Purchase(long customerId, long couponId, Date purchaseDate) {
		this.customerId = customerId;
		this.couponId = couponId;
		this.purchaseDate = purchaseDate;
	}
	
	public Purchase() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	public long getCouponId() {
		return couponId;
	}
	
	public void setCouponId(long couponId) {
		this.couponId = couponId;
	}
	
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
}
