package com.couponbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.couponbank.dao.AdminServiceDao;
import com.couponbank.dao.BankServiceDao;
import com.couponbank.models.BankTransaction;
@Component
@Service("BankService")
public class BankServiceImpl implements BankService{
	
	@Autowired
	BankServiceDao bankserviceDao;
	
	@Transactional
	public boolean makeTransaction(BankTransaction bankTransaction) {
		// TODO Auto-generated method stub
		return false;
	}

}
