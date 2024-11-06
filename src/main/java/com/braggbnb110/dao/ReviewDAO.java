package com.braggbnb110.dao;

import java.util.List;

import com.braggbnb110.dao.GenericDAO;
import com.braggbnb110.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


