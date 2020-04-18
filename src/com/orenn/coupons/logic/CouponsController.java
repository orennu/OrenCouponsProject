package com.orenn.coupons.logic;

import java.time.LocalDateTime;

import com.orenn.coupons.beans.Coupon;
import com.orenn.coupons.dao.CouponsDao;
import com.orenn.coupons.exceptions.ApplicationException;
import com.orenn.coupons.utils.Utils;

public class CouponsController {
	
	private CouponsDao couponsDao;
	private CompaniesController companiesController;
	
	public CouponsController() {
		this.couponsDao = new CouponsDao();
		this.companiesController = new CompaniesController();
	}
	
	public void addCoupon(Coupon coupon) throws ApplicationException {
		if (!isCouponAttributesValid(coupon)) {
			throw new ApplicationException();
		}
		if (this.couponsDao.isCouponExists(coupon.getCouponName(), coupon.getCompanyId(),
				coupon.getStartDate(), coupon.getExpirationDate())) {
			throw new ApplicationException("coupon already exists");
		}
		
		this.couponsDao.addCoupon(coupon);
	}
	
	public void updateCoupon(Coupon coupon) throws ApplicationException {
		if (!isCouponAttributesValid(coupon)) {
			throw new ApplicationException();
		}
		if (!this.couponsDao.isCouponExists(coupon.getCouponId())) {
			throw new ApplicationException("coupon does not exists");
		}
		
		this.couponsDao.updateCoupon(coupon);
	}
	
	public void removeCoupon(long couponId) throws ApplicationException {
		if (!this.couponsDao.isCouponExists(couponId)) {
			throw new ApplicationException("coupon does not exists");
		}
		
		this.couponsDao.removeCoupon(couponId);
	}
	
	private boolean isCouponAttributesValid(Coupon coupon) throws ApplicationException {
		if (coupon == null) {
			throw new ApplicationException("coupon is null");
		}
		if (!Utils.isValidLength(coupon.getCouponName(), 2, 30)) {
			throw new ApplicationException("invalid coupon name length, must be between 2-30");
		}
		if (!isValidCouponNameOrDescription(coupon.getCouponName())) {
			throw new ApplicationException("invalid coupon name, cannot be empty");
		}
		if (!Utils.isValidLength(coupon.getDescription(), 2, 30)) {
			throw new ApplicationException("invalid coupon description length, must be between 2-30");
		}
		if (!isValidCouponNameOrDescription(coupon.getDescription())) {
			throw new ApplicationException("invalid coupon description, cannot be empty");
		}
		if (!this.companiesController.isCompanyExists(coupon.getCompanyId())) {
			throw new ApplicationException();
		}
		if (coupon.getPrice() <= 0) {
			throw new ApplicationException("invalid coupon price, must be greater than 0");
		}
		if (!Utils.isValidUrl(coupon.getCouponImage().toString())) {
			throw new ApplicationException("invalid image URL format");
		}
		if (coupon.getQuantity() <= 0) {
			throw new ApplicationException("invalid coupon quantity, must be greater than 0");
		}
		if (coupon.getStartDate().isBefore(LocalDateTime.now())) {
			throw new ApplicationException("coupon start date and time cannot be in the past");
		}
		if (coupon.getExpirationDate().isBefore(LocalDateTime.now())) {
			throw new ApplicationException("coupon expiration date and time cannot be in the past");
		}
		if (coupon.getStartDate().isAfter(coupon.getExpirationDate())) {
			throw new ApplicationException("coupon start date and time cannot be after expiration date and time");
		}
		
		return true;
		
	}

	private boolean isValidCouponNameOrDescription(String couponName) {
		if (couponName.trim().length() > 0) {
			return true;
		}
		
		return false;
	}

}
