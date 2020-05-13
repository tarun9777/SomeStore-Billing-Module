package com.capstore.app.models;

import java.util.Set;

public class MarchantDetails {

	private int merchantId; //(from User.user_id)
	private String username;    //(from User.username)
	private String name;
	private String phoneNumber;
	private String alternatePhoneNumber;
	private String alternateEmail;
	Set<Order> orders;
	Set<UserAddress> addresses;
	Set<Coupon> coupons;
	Set<Product> products;
    Set<CommonFeedback> feedbacks;
    private boolean isApproved;
    private int rating;
	
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAlternatePhoneNumber() {
		return alternatePhoneNumber;
	}
	public void setAlternatePhoneNumber(String alternatePhoneNumber) {
		this.alternatePhoneNumber = alternatePhoneNumber;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	public Set<UserAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<UserAddress> addresses) {
		this.addresses = addresses;
	}
	public Set<Coupon> getCoupons() {
		return coupons;
	}
	public void setCoupons(Set<Coupon> coupons) {
		this.coupons = coupons;
	}
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Set<CommonFeedback> getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(Set<CommonFeedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public MarchantDetails() {
	}
	
}
