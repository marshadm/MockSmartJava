package com.hcl.ing.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hcl.ing.model.PaymentDetails;

@Service
public interface PaymentDetailsService {

	public void paymentSave(PaymentDetails paymentDetails);
	
	public String getBalance(int id);
	public void updateBalance(double balance,int id);
}
