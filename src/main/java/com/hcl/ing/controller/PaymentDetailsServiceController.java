package com.hcl.ing.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.model.PaymentDetails;
import com.hcl.ing.service.PaymentDetailsService;

@RestController
@CrossOrigin
@RequestMapping("/paymentdetails")
public class PaymentDetailsServiceController {

	@Autowired
	PaymentDetailsService paymentDetailsService;

	@PostMapping("/savedetails")
	public String savePaymentDetails(@RequestBody PaymentDetails paymentDetails,@RequestParam(name="id") int id) {

		String message = "";
		//System.out.println(paymentDetails.getPaymentType());
		String dbBalance=paymentDetailsService.getBalance(id);
		System.out.println(dbBalance);
		double balance=Double.parseDouble(dbBalance);
		System.out.println("balance:"+balance);
		if (paymentDetails.getPaymentType().equals("make payment")) {
			if (paymentDetails.getAmount() <= 0 ) {
				message = "Not valid amount have entered, Please enter valid amount more then zero";
			}else if(paymentDetails.getAmount() >= balance) {
				message="In sufficient balance";
			}else if (paymentDetails.getSpendCategory().equals("Medical")
					|| paymentDetails.getSpendCategory().equals("Loans")
					|| paymentDetails.getSpendCategory().equals("Travel")
					|| paymentDetails.getSpendCategory().equals("Utility Bills")
					|| paymentDetails.getSpendCategory().equals("Education")
					|| paymentDetails.getSpendCategory().equals("Shopping")
					|| paymentDetails.getSpendCategory().equals("Misc")) {
				balance=balance-paymentDetails.getAmount();
				paymentDetailsService.updateBalance(balance, id);
				//paymentDetails.setBalance(paymentDetails.getAmount());
				
				//paymentDetailsService.paymentSave(paymentDetails);

				message = "payments Details updated successfully !!";
			}
			else {
				message="please enter valid spend category!!";
			}

		}else if(paymentDetails.getPaymentType().equals("receive payment")) {
			if (paymentDetails.getAmount() <= 0 ) {
				message="please enter valid amount";
			}else {

				balance=balance+paymentDetails.getAmount();
				paymentDetailsService.updateBalance(balance, id);
				//paymentDetails.setBalance(paymentDetails.getAmount());
				//paymentDetailsService.paymentSave(paymentDetails);
				message = "payments Details Received successfully !!";
			}
		}

		return message;
	}
	
	@GetMapping("/monthlyDetails")
	public String monthlyBalanceDetails(@RequestParam(name="id") int id) {
		String dbBalance=paymentDetailsService.getBalance(id);
		return dbBalance;
	}
}
