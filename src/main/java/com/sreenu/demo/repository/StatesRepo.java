package com.sreenu.demo.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sreenu.demo.binding.States;

public interface StatesRepo extends JpaRepository<States, Integer>{
	
	@Query("Select distinct(s.statesId) from States s, Country c where s.countryId=c.countryId")
	public Map<Integer, String> getStates();

}
