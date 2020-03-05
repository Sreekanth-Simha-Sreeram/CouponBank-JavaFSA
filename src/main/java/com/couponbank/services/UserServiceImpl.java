package com.couponbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.couponbank.dao.LoginServiceDao;
import com.couponbank.dao.UserServiceDao;
import com.couponbank.models.BankCoupon;
import com.couponbank.models.User;
@Component
@Service("UserService")
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserServiceDao userserviceDao;
	

	@Transactional
	public boolean addCoupon(BankCoupon bankCoupon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public BankCoupon requestCoupon(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
