package com.couponbank.services;

import com.couponbank.models.User;

public interface LoginService {
	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
