package com.capstore.app.models;

import java.util.Date;

public class Coupon {
	//(Foreign Key)
	private int userId;
    private Date couponEndDate;
    private Date couponStartDate;
    private int couponAmount; 
    private int couponMinOrderAmount;
    private String issuedBy; //{“Admin”,”Merchant”}
    
	public int getUserId() {
		return userId;
	}
	public void setUseId(int user_id) {
		this.userId = user_id;
	}
	public Date getCouponEndDate() {
		return couponEndDate;
	}
	public void setCouponEndDate(Date couponEndDate) {
		this.couponEndDate = couponEndDate;
	}
	public Date getCouponStartDate() {
		return couponStartDate;
	}
	public void setCouponStartDate(Date couponStartDate) {
		this.couponStartDate = couponStartDate;
	}
	public int getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(int couponAmount) {
		this.couponAmount = couponAmount;
	}
	public int getCouponMinOrderAmount() {
		return couponMinOrderAmount;
	}
	public void setCouponMinOrderAmount(int couponMinOrderAmount) {
		this.couponMinOrderAmount = couponMinOrderAmount;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public Coupon() {
	} 
	
}
