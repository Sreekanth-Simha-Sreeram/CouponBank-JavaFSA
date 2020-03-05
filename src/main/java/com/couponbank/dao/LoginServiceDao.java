package com.couponbank.dao;

import com.couponbank.models.User;

public interface LoginServiceDao {

	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
