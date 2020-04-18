package com.orenn.coupons.beans;
import java.util.Date;

public class Purchase {
	
	private long purchaseId;
	private long customerId;
	private long couponId;
	private int quantity;
	private Date purchaseDate;

	public Purchase(long purchaseId, long customerId, long couponId, int quantity, Date purchaseDate) {
		this.purchaseId = purchaseId;
		this.customerId = customerId;
		this.couponId = couponId;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
	}

	public Purchase(long customerId, long couponId, int quantity, Date purchaseDate) {
		this.customerId = customerId;
		this.couponId = couponId;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
	}
	
	public Purchase() {
	}
	
	public long getPurchaseId() {
		return purchaseId;
	}
	
	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
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
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", customerId=" + customerId + ", couponId=" + couponId
				+ ", quantity=" + quantity + ", purchaseDate=" + purchaseDate + "]";
	}
	
}
