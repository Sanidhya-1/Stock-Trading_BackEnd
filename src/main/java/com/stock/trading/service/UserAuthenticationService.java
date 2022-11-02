package com.stock.trading.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.trading.dao.UserAuthenticationDao;
import com.stock.trading.model.User;

@Service
public class UserAuthenticationService {

	@Autowired
	private UserAuthenticationDao userAuthenticationDao;
	
	public boolean registerUser(User user) {
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		this.userAuthenticationDao.saveUser(user);
		return true;
		
	}
	
	public boolean checkIfRegistered(User user) {
		
		int result = this.userAuthenticationDao.checkIfUserExist(user.getEmail());
		return result == 1 ? true : false;
	}
	
	
}
