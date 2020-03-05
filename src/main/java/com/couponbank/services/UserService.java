package com.couponbank.services;

import com.couponbank.models.BankCoupon;
import com.couponbank.models.User;

public interface UserService {
	

boolean addCoupon(BankCoupon bankCoupon);
BankCoupon requestCoupon(int userId);


}
