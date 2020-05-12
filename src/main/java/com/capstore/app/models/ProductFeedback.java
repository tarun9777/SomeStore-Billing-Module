package com.capstore.app.models;

public class ProductFeedback {
	//(Primary Key)
	private Integer feedbackId; 
    private String feedbackSubject;
    private String feedbackMessage;
    //(Foreign Key)
    private int productId;
    //(Foreign Key)
    private int userId;
     
	
    
	public Integer getFeedbackId() {
		return feedbackId;
	}



	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}



	public String getFeedbackSubject() {
		return feedbackSubject;
	}



	public void setFeedbackSubject(String feedbackSubject) {
		this.feedbackSubject = feedbackSubject;
	}



	public String getFeedbackMessage() {
		return feedbackMessage;
	}



	public void setFeedbackMessage(String feedbackMessage) {
		this.feedbackMessage = feedbackMessage;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public ProductFeedback() {
	} 
     
     
}
