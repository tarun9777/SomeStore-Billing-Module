package com.capstore.app.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "customer_details")
public class CustomerDetails extends User {
	
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "alternate_phone_number")
    private String alternatePhoneNumber;
    @Column(name = "alternate_email")
    private String alternateEmail;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = CommonFeedback.class)
    Set<CommonFeedback> feedbacks;
	/*
	 * Set<Order> orders; Set<UserAddress> addresses;
	 * Set<ProductFeedback> productFeedbacks; Set<Cart> list;
	 */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Cart.class)
    private Cart customerCart;
	public Cart getCustomerCart() {
		return customerCart;
	}
	public void setCustomerCart(Cart customerCart) {
		this.customerCart = customerCart;
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
	
	public Set<CommonFeedback> getFeedbacks() { return feedbacks; } 
	public void setFeedbacks(Set<CommonFeedback> feedbacks) { this.feedbacks = feedbacks; }
	
	
	/*
	 * public Set<Order> getOrders() { return orders; } public void
	 * setOrders(Set<Order> orders) { this.orders = orders; } public
	 * Set<UserAddress> getAddresses() { return addresses; } public void
	 * setAddresses(Set<UserAddress> addresses) { this.addresses = addresses; }
	 * public Set<ProductFeedback> getProductFeedbacks() { return productFeedbacks;
	 * } public void setProductFeedbacks(Set<ProductFeedback> productFeedbacks) {
	 * this.productFeedbacks = productFeedbacks; } public Set<Cart> getList() {
	 * return list; } public void setList(Set<Cart> list) { this.list = list; }
	 */
	public CustomerDetails() {
	}

}
