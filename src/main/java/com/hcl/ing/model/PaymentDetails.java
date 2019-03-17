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
	String transaction_details;
	
	@Column(name="spend_category")
	String spend_category;
	
	@Column(name="amount")
	int amount;
	
	
	@Column(name="date")
	String date;
	
	@Column(name="payment_type ")
	String paymentType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransaction_details() {
		return transaction_details;
	}

	public void setTransaction_details(String transaction_details) {
		this.transaction_details = transaction_details;
	}

	public String getSpend_category() {
		return spend_category;
	}

	public void setSpend_category(String spend_category) {
		this.spend_category = spend_category;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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
	
	
	
}
