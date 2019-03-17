package com.hcl.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.model.PaymentDetails;
import com.hcl.ing.service.PaymentDetailsService;

@RestController
@CrossOrigin
@RequestMapping("/paymentdetails")
public class PaymentDetailsServiceController {

	@Autowired
	PaymentDetailsService paymentDetailsService;
	
	@RequestMapping("/savedetails")
	public String savePaymentDetails(@RequestBody PaymentDetails paymentDetails) {
		
		String message="";
		System.out.println(paymentDetails.getPaymentType());
		if(paymentDetails.getPaymentType().equals("make payment")) {
			if(paymentDetails.getAmount() <=0 ) {
				message = "Not valid amount have entered, Please enter valid amount more then zero";
			}
			else {
				paymentDetailsService.paymentSave(paymentDetails);
				
				message="payments Details saved successfully !!";
			}
			
		}
		
		return message;
	}
}
