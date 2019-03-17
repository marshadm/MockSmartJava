package com.hcl.ing.service;

import java.util.Optional;

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
	@Override
	public String getBalance(int id) {
		// TODO Auto-generated method stub
		return paymentDetailsServiceDao.getBalance(id);
	}
	@Override
	public void updateBalance(double balance, int id) {
		// TODO Auto-generated method stub
		
		paymentDetailsServiceDao.updateBalance(balance, id);
		
	}

}
