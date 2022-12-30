package com.sreenu.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sreenu.demo.binding.User;
import com.sreenu.demo.service.UserManagementService;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementService service;
	
	@GetMapping("/checkmail")
	public String checkMail(String email) {
		return service.checkMail(email);
	}
	
	@GetMapping("/country")
	public Map<Integer, String> getCountries(){
		return service.getCountries();
	}
	
	@GetMapping("/states")
	public Map<Integer, String> getStates(Integer countryId){
		return service.getStates(countryId);
	}
	
	@GetMapping("/cities")
	public Map<Integer, String> getCities(Integer stateId){
		return service.getCities(stateId);
	}
	
	@GetMapping("/registeruser")
	public String registerUser(User user) {
		return service.registerUser(user);
	}

}
