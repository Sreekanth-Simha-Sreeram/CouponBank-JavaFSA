package com.couponbank.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.couponbank.models.BankCoupon;
import com.couponbank.models.User;
@Component
public class UserServiceDaoImpl implements UserServiceDao {

	@Autowired
	SessionFactory sessionfactory;

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
