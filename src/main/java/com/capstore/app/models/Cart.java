package com.capstore.app.models;

public class Cart {

	private String userID;  //(references cust_id)
    private int productId;   //(Primary Key)
    private int noOfProducts;
    private String type;  //(“Wishlist”,”cart”)
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Cart() {
	}

}
