package com.couponbank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.couponbank.dao.AdminServiceDao;
import com.couponbank.models.BankTransaction;
import com.couponbank.models.CommissionDetails;
import com.couponbank.models.User;
@Component
@Service("AdminService")
public class AdminServiceImpl implements AdminService {
@Autowired
AdminServiceDao adminserviceDao;

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
