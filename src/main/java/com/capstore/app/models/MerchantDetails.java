package com.capstore.app.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "merchant_details")
public class MerchantDetails extends User{

	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "alternate_phone_number")
	private String alternatePhoneNumber;
	@Column(name = "alternate_email")
	private String alternateEmail;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Product.class)
	Set<Product> products;
	/*
	 * Set<Order> orders; Set<UserAddress> addresses; Set<Coupon> coupons;
	 *  Set<CommonFeedback> feedbacks;
	 */
    @Column(name = "is_approved")
    private boolean isApproved;
    @Column(name = "rating")
    private int rating;
	
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
	
	public Set<Product> getProducts() { return products; } 
	public void setProducts(Set<Product> products) { this.products = products; }

	/*
	 * public Set<Order> getOrders() { return orders; } public void
	 * setOrders(Set<Order> orders) { this.orders = orders; } public
	 * Set<UserAddress> getAddresses() { return addresses; } public void
	 * setAddresses(Set<UserAddress> addresses) { this.addresses = addresses; }
	 * public Set<Coupon> getCoupons() { return coupons; } public void
	 * setCoupons(Set<Coupon> coupons) { this.coupons = coupons; }
	 * 
	 *  public Set<CommonFeedback> getFeedbacks() { return feedbacks; } public void
	 * setFeedbacks(Set<CommonFeedback> feedbacks) { this.feedbacks = feedbacks; }
	 */
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
	public MerchantDetails() {
	}
	
}
