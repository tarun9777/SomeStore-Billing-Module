package com.capstore.app.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstore.app.models.Coupon;
import com.capstore.app.models.Order;
import com.capstore.app.repository.CouponsRepository;

@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private CouponsRepository couponsRepository;

	@Override
	public Order isCouponValid(String couponCode, Order order) {
		
		Coupon coupon = couponsRepository.findByCouponCode(couponCode);
		
		Date startDate = coupon.getCouponStartDate();
		Date endDate = coupon.getCouponEndDate();
		
		long millis = System.currentTimeMillis();
		Date currentDate = new Date(millis);
		
		if(coupon.equals(null)) {
			return null;
		}
		else {
			//compare current date is between coupon's start date and end date then declare it valid
			if(currentDate.after(startDate) && currentDate.before(endDate)) {
				//also compare product's amount is more than couponMinOrderAmount
				if(order.getOrderAmount()>coupon.getCouponMinOrderAmount()) {
					double currentAmount = order.getOrderAmount();
					double afterDiscountAmount = currentAmount - coupon.getCouponAmount();
					
					order.setOrderAmount(afterDiscountAmount);
					return order;
				}
				else
					return null;
			}
			else
				return null;
		}
	}
}
