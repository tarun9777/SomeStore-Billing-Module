package com.capstore.app.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {

	@Id
	@Column(name = "cart_id")
    private int cartId;   //(Primary Key)
	@Column(name = "user_id")
	private int userID;  //(references cust_id)
	@Column(name = "type")
    private String type;  //(“Wishlist”,”cart”)
	
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, targetEntity = Product.class)
	private List<Product> products;
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Cart() {
	}

}
