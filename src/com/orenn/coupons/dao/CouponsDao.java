package com.orenn.coupons.dao;

import java.time.LocalDate;

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

	public boolean isCouponExists(String couponName, long companyId, LocalDate startDate,
			LocalDate expirationDate) {
		return false;
	}
	
	public boolean isCouponExists(long couponId) {
		return false;
	}

}
