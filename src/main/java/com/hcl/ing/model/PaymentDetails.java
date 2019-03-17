package com.hcl.ing.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="payment_details")
public class PaymentDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column(name ="transaction_details")
	String transactionDetails;
	
	@Column(name="spend_category")
	String spendCategory;
	
	@Column(name="amount")
	double amount;
	
	
	@Column(name="date")
	String date;
	
	@Column(name="payment_type ")
	String paymentType;
	
	
	@Column(name="balance")
	double balance;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


	public String getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public String getSpendCategory() {
		return spendCategory;
	}

	public void setSpendCategory(String spendCategory) {
		this.spendCategory = spendCategory;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
