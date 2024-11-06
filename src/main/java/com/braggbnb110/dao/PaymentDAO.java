package com.braggbnb110.dao;

import java.util.List;

import com.braggbnb110.dao.GenericDAO;
import com.braggbnb110.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


