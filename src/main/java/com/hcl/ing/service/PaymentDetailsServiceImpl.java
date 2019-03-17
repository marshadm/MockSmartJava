package com.hcl.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ing.dao.PaymentDetailsServiceDao;
import com.hcl.ing.model.PaymentDetails;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService{

	@Autowired
	PaymentDetailsServiceDao paymentDetailsServiceDao;
	@Override
	public void paymentSave(PaymentDetails paymentDetails) {
		paymentDetailsServiceDao.save(paymentDetails);
	}

}
