package com.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.LoginForm;
import com.user.model.UserManagement;

@Service
public class UserServiceImpl implements UserManagementService{
	@Autowired
	private  UserManagement userManagement;

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#checkEmail(java.lang.String)
	 */
	@Override
	public String checkEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#getContries()
	 */
	@Override
	public Map<Integer, String> getContries() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#getStates()
	 */
	@Override
	public Map<Integer, String> getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#getCities()
	 */
	@Override
	public Map<Integer, String> getCities() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#registerUser(com.user.model.UserManagement)
	 */
	@Override
	public String registerUser(UserManagement userManagement) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#unlockAccount(com.user.model.LoginForm)
	 */
	@Override
	public String unlockAccount(LoginForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#login(com.user.model.LoginForm)
	 */
	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.user.service.UserManagementService#forgotpwd(java.lang.String)
	 */
	@Override
	public String forgotpwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
