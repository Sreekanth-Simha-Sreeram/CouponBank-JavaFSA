package com.couponbank.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.couponbank.models.BankTransaction;
import com.couponbank.models.CommissionDetails;
import com.couponbank.models.User;
@Component
public class AdminServiceDaoImpl implements AdminServiceDao {
@Autowired
SessionFactory sessionfactory;

@Transactional
	public List<User> getAllUserList() {
		// TODO Auto-generated method stub
		return null;
	}
@Transactional
	public boolean inActiveUser(List<Integer> UserId) {
		// TODO Auto-generated method stub
		return false;
	}
@Transactional
	public List<BankTransaction> getAllTransactionList() {
		// TODO Auto-generated method stub
		return null;
	}
@Transactional
	public List<CommissionDetails> getAllCommissionList() {
		// TODO Auto-generated method stub
		return null;
	}
@Transactional
	public CommissionDetails getCommissionById(int commissionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
