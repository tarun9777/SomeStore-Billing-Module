package com.capstore.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@Column(name="order_id")
	private long orderId;
	@Column(name="shipping_address")
	private String shippingAddress;
	@Column(name="total_amount")
	private double totalAmount;
	@Column(name="total_discount")
	private double totalDiscount;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = User.class)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Cart.class)
    private Cart customerCart;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart getCustomerCart() {
		return customerCart;
	}

	public void setCustomerCart(Cart customerCart) {
		this.customerCart = customerCart;
	}

	public Orders(long orderId, String shippingAddress, double totalAmount, double totalDiscount, User user,
			Cart customerCart) {
		super();
		this.orderId = orderId;
		this.shippingAddress = shippingAddress;
		this.totalAmount = totalAmount;
		this.totalDiscount = totalDiscount;
		this.user = user;
		this.customerCart = customerCart;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", shippingAddress=" + shippingAddress + ", totalAmount=" + totalAmount
				+ ", totalDiscount=" + totalDiscount + ", user=" + user + ", customerCart=" + customerCart + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerCart == null) ? 0 : customerCart.hashCode());
		result = prime * result + (int) (orderId ^ (orderId >>> 32));
		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalDiscount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		if (customerCart == null) {
			if (other.customerCart != null)
				return false;
		} else if (!customerCart.equals(other.customerCart))
			return false;
		if (orderId != other.orderId)
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		if (Double.doubleToLongBits(totalAmount) != Double.doubleToLongBits(other.totalAmount))
			return false;
		if (Double.doubleToLongBits(totalDiscount) != Double.doubleToLongBits(other.totalDiscount))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
}
