package com.sreenu.demo.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreenu.demo.binding.LoginForm;
import com.sreenu.demo.binding.States;
import com.sreenu.demo.binding.UnlockAccForm;
import com.sreenu.demo.binding.User;
import com.sreenu.demo.repository.CityRepo;
import com.sreenu.demo.repository.CountryRepo;
import com.sreenu.demo.repository.StatesRepo;
import com.sreenu.demo.repository.UserRepo;

@Service
public class UserManagementServiceImpl implements UserManagementService{

	@Autowired
	public CountryRepo countryRepo;
	
	@Autowired 
	public StatesRepo statesRepo;
	
	@Autowired
	public CityRepo cityRepo;
	
	@Autowired
	public UserRepo userRepo;
	
	@Override
	public String checkMail(String email) {
		 if(email.contains(email)) {
			 return "Email Already Exist";
		 }else {
			 return "It is not available in the database";
		 }
	}

	@Override
	public Map<Integer, String> getCountries() {
		
		return countryRepo.getCountries();
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		Optional<States> findById = statesRepo.findById(countryId);
		return findById;
	}

	@Override
	public Map<Integer, String> getCities(Integer statesId) {
		
		return null;
	}

	@Override
	public String registerUser(User user) {
		user=userRepo.save(user);
		if(user.getUserId()!=null) {
			return "User Registration Completed Successfully";
		}else {
			return "User Registration failed";
		}
		
	}

	@Override
	public String unlockAccount(UnlockAccForm accForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
