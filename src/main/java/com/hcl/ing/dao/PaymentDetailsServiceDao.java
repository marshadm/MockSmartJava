package com.hcl.ing.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.ing.model.PaymentDetails;

@Repository
public interface PaymentDetailsServiceDao extends JpaRepository<PaymentDetails,Integer>,CrudRepository<PaymentDetails,Integer>{

	//Optional<PaymentDetails> findById(int id);
	@Query("SELECT  p.balance from PaymentDetails p where p.id=?1")
	public String getBalance(int id);
	
	  @Transactional
	  @Modifying
	@Query("UPDATE PaymentDetails p set p.balance=?1 where p.id=?2")
	public void updateBalance(double balance,int id);
}
