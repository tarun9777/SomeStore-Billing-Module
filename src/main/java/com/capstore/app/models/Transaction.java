package com.capstore.app.models;

import java.util.Date;

public class Transaction {

	//(primary key)
	private int transactionId;
	//(Foreign Key)
    private int orderId;
    private Date transactionDate;
    private int transactionMoney;
    private String transactionMethod;  //(“Credit”,”Debit”,”UPI”,”Wallet”)
    private String transactionStatus;   //(“Success”,”Fail”,”Pending”)
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getTransactionMoney() {
		return transactionMoney;
	}
	public void setTransactionMoney(int transactionMoney) {
		this.transactionMoney = transactionMoney;
	}
	public String getTransactionMethod() {
		return transactionMethod;
	}
	public void setTransactionMethod(String transactionMethod) {
		this.transactionMethod = transactionMethod;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public Transaction() {
	}
    
}
