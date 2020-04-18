package com.orenn.coupons.beans;
import java.net.URL;
import java.time.LocalDateTime;
import com.orenn.coupons.enums.CouponCategory;

public class Coupon {
	
	private long couponId;
	private String couponName;
	private String description;
	private long companyId;
	private float price;
	private CouponCategory category;
	private URL couponImage;
	private int quantity;
	private LocalDateTime startDate;
	private LocalDateTime expirationDate;
	
	public Coupon(long couponId, String couponName, String description, long companyId, float price,
			CouponCategory category, URL couponImage, int quantity, LocalDateTime startDate, LocalDateTime expirationDate) {
		this.couponId = couponId;
		this.couponName = couponName;
		this.description = description;
		this.companyId = companyId;
		this.price = price;
		this.category = category;
		this.couponImage = couponImage;
		this.quantity = quantity;
		this.startDate = startDate;
		this.expirationDate = expirationDate;
	}

	public Coupon(String couponName, String description, long companyId, float price, CouponCategory category,
			URL couponImage, int quantity, LocalDateTime startDate, LocalDateTime expirationDate) {
		this.couponName = couponName;
		this.description = description;
		this.companyId = companyId;
		this.price = price;
		this.category = category;
		this.couponImage = couponImage;
		this.quantity = quantity;
		this.startDate = startDate;
		this.expirationDate = expirationDate;
	}

	public Coupon() {
	}

	public long getCouponId() {
		return couponId;
	}

	public void setCouponId(long couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
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
	
	public URL getCouponImage() {
		return couponImage;
	}

	public void setCouponImage(URL couponImage) {
		this.couponImage = couponImage;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	
	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponName=" + couponName + ", description=" + description
				+ ", companyId=" + companyId + ", price=" + price + ", category=" + category + ", couponImage="
				+ couponImage + ", quantity=" + quantity	+ ", startDate=" + startDate + ", expirationDate="
				+ expirationDate + "]";
	}
	
}
