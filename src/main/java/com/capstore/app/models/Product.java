package com.capstore.app.models;

import java.util.Set;

public class Product {

	private int productId;
    private String productName;
    private String productImage;
    private double productPrice;
    private int productRating;
    private int noOfProductViewed;
    private String productBrand;
    private int noOfProducts;
    private String productInfo;
    private String productCategory;
    private boolean productActivated; 
    private boolean status;
    private boolean featured;
    //(Foreign Key: Merhcant)
    private int productMerchantId;
    Set<ProductFeedback> feedbacks;
    
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
	public int getNoOfProductViewed() {
		return noOfProductViewed;
	}
	public void setNoOfProductViewed(int noOfProductViewed) {
		this.noOfProductViewed = noOfProductViewed;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	public String getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public boolean isProductActivated() {
		return productActivated;
	}
	public void setProductActivated(boolean productActivated) {
		this.productActivated = productActivated;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isFeatured() {
		return featured;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	public int getProductMerchantId() {
		return productMerchantId;
	}
	public void setProductMerchantId(int productMerchantId) {
		this.productMerchantId = productMerchantId;
	}
	public Set<ProductFeedback> getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(Set<ProductFeedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	public Product() {
	}

	
}
