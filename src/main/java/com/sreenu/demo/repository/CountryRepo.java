package com.sreenu.demo.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sreenu.demo.binding.Country;

public interface CountryRepo extends JpaRepository<Country, Integer> {

	@Query("select distinct(countryId) from Country")
	public Map<Integer, String> getCountries();
}
