package com.capstore.app.models;

public class CommonFeedback {

	private int feedbackId;  //(Primary Key)
    private String feedbackSubject;
    private String feedbackMessage;
    private int feedbackForUserId;  //(Foreign Key)
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
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
	public int getFeedbackForUserId() {
		return feedbackForUserId;
	}
	public void setFeedbackForUserId(int feedbackForUserId) {
		this.feedbackForUserId = feedbackForUserId;
	}
	public CommonFeedback() {
	}
}
