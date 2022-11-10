package com.stock.trading.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.trading.model.User;


@Component	
public class UserAuthenticationDao  {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public User saveUser(User user) {
		return this.entityManager.merge(user);
	}
	
	public int checkIfUserExist(String email) {
		Query query = this.entityManager.createQuery("SELECT COUNT(u) FROM user u WHERE u.email = ?1");
		query.setParameter(1, email);
		query.setMaxResults(1);
		Long resultLong = (Long) query.getSingleResult();
		return Math.toIntExact(resultLong);
	}
	
	public User getProfileOfUser(String email) {
		Query query = this.entityManager.createQuery("SELECT u from user u WHERE u.email=?1");
		query.setParameter(1, email);
		query.setMaxResults(1);
		User user = (User) query.getSingleResult();
		return user;
	}
	
	
}
