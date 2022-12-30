package com.sreenu.demo.service;

import java.util.Map;

import com.sreenu.demo.binding.LoginForm;
import com.sreenu.demo.binding.UnlockAccForm;
import com.sreenu.demo.binding.User;

public interface UserManagementService {
	public String checkMail(String email);
	public Map<Integer, String> getCountries();
	public Map<Integer, String> getStates(Integer countryId);
	public Map<Integer, String> getCities(Integer statesId);
	public String registerUser(User user);
	public String unlockAccount(UnlockAccForm accForm);
	public String login(LoginForm loginForm);
	public String forgotPwd(String email);
	

}
