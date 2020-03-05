package com.couponbank.dao;

import java.util.List;

import com.couponbank.models.BankTransaction;
import com.couponbank.models.CommissionDetails;
import com.couponbank.models.User;

public interface AdminServiceDao {
	
List<User> getAllUserList();
boolean inActiveUser(List<Integer> UserId);
List<BankTransaction> getAllTransactionList();
List<CommissionDetails>getAllCommissionList();
CommissionDetails getCommissionById(int commissionId);

}
