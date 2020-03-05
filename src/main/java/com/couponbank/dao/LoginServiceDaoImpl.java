package com.couponbank.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.couponbank.models.User;
@Component
public class LoginServiceDaoImpl implements LoginServiceDao {
	
	@Autowired
	SessionFactory sessionfactory;
	
	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean resetPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
