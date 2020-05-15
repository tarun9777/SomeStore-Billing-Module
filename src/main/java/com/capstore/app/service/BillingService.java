package com.capstore.app.service;

import com.capstore.app.models.Coupon;
import com.capstore.app.models.Order;

public interface BillingService {
	public Order isCouponValid(String couponCode, Order order);
	
}
