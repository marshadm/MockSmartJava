package com.hcl.ing.service;

import org.springframework.stereotype.Service;

import com.hcl.ing.model.PaymentDetails;

@Service
public interface PaymentDetailsService {

	public void paymentSave(PaymentDetails paymentDetails);
}
