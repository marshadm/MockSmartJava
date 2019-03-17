package com.hcl.ing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ing.model.PaymentDetails;

public interface PaymentDetailsServiceDao extends JpaRepository<PaymentDetails,Integer>{

}
