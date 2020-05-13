package com.capstore.app.models;

import java.util.Set;

public class CustomerDetails {

	private int customerId; //(from User.user_id)
    private String customerUsername;   //(from User.username)
    private String customerPassword; //(from User.password)
    private String name;
    private String phoneNumber; 
    private String alternatePhoneNumber; 
    private String alternateEmail;

    Set<Order> orders;
    Set<UserAddress> addresses;
    Set<CommonFeedback> feedbacks;    
    Set<ProductFeedback> productFeedbacks;
    Set<Cart> list;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
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
	public Set<CommonFeedback> getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(Set<CommonFeedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	public Set<ProductFeedback> getProductFeedbacks() {
		return productFeedbacks;
	}
	public void setProductFeedbacks(Set<ProductFeedback> productFeedbacks) {
		this.productFeedbacks = productFeedbacks;
	}
	public Set<Cart> getList() {
		return list;
	}
	public void setList(Set<Cart> list) {
		this.list = list;
	}
	public CustomerDetails() {
	}

}
