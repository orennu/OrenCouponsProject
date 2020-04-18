package com.orenn.coupons.dao;

import java.time.LocalDateTime;

import com.orenn.coupons.beans.Coupon;

public class CouponsDao {
	
	public void addCoupon(Coupon coupon) {
		System.out.println("coupon added");
	}
	
	public void updateCoupon(Coupon coupon) {
		System.out.println("coupon updated");
	}
	
	public void removeCoupon(long couponId) {
		System.out.println("coupon removed");
	}

	public boolean isCouponExists(String couponName, long companyId, LocalDateTime startDate,
			LocalDateTime expirationDate) {
		return false;
	}
	
	public boolean isCouponExists(long couponId) {
		return false;
	}

}
