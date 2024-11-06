package com.braggbnb110.dao;

import java.util.List;

import com.braggbnb110.dao.GenericDAO;
import com.braggbnb110.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


