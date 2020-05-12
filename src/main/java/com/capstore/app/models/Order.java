package com.capstore.app.models;

import java.util.Map;

public class Order {
	
	private int orderId; //(Primary Key)
	private double orderAmount;
	Map<Product,Integer> products;
	private String orderStatus; // { “Placed”, “Shipped”, “Out For Delivery”, “Delivered”, “Request For Return”, “Returned”, “Refunded” , “Cancelled” }
	private int addressId;
	private int couponId;  //(Foreign Key) (Can be null)
	private int userId;   // (Foreign Key)
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderid) {
		this.orderId = orderid;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Map<Product, Integer> getProducts() {
		return products;
	}
	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
