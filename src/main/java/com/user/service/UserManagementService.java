package com.user.service;

import java.util.Map;

import com.user.model.LoginForm;
import com.user.model.UserManagement;

public interface UserManagementService {
	public String checkEmail(String email);
	public Map<Integer,String> getContries();
	public Map<Integer,String> getStates();
	public Map<Integer,String> getCities();
	public String registerUser(UserManagement userManagement);
	public String unlockAccount(LoginForm form);
	public String login(LoginForm loginForm);
	public String forgotpwd(String email);
}
