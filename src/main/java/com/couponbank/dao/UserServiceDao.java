package com.couponbank.dao;

import com.couponbank.models.BankCoupon;
import com.couponbank.models.User;

public interface UserServiceDao {

	boolean addCoupon(BankCoupon bankCoupon);
	BankCoupon requestCoupon(int userId);
	
}
