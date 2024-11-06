package com.braggbnb110.dao;

import java.util.List;

import com.braggbnb110.dao.GenericDAO;
import com.braggbnb110.domain.Booking;





public interface BookingDAO extends GenericDAO<Booking, Integer> {
  
	List<Booking> findAll();
	






}


