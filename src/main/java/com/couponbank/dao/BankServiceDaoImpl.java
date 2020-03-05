package com.couponbank.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.couponbank.models.BankTransaction;
@Component
public class BankServiceDaoImpl implements BankServiceDao {
	@Autowired
	SessionFactory sessionfactory;
	
	@Transactional
	public boolean makeTransaction(BankTransaction bankTransaction) {
		// TODO Auto-generated method stub
		return false;
	}

}
