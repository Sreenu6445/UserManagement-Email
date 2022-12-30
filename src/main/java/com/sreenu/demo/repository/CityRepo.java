package com.sreenu.demo.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sreenu.demo.binding.City;

public interface CityRepo extends JpaRepository<City, Integer> {

	@Query("Select distinct(c.cityId) from States s, City c where s.statesId=c.statesId")
	public Map<Integer, String> getCities();
}
