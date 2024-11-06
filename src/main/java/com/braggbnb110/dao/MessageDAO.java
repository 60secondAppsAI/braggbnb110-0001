package com.braggbnb110.dao;

import java.util.List;

import com.braggbnb110.dao.GenericDAO;
import com.braggbnb110.domain.Message;





public interface MessageDAO extends GenericDAO<Message, Integer> {
  
	List<Message> findAll();
	






}


