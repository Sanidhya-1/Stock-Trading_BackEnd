package com.stock.trading.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.trading.model.User;


@Component	
public class UserAuthenticationDao  {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public User saveUser(User user) {
		return this.entityManager.merge(user);
	}
	
	
}
