package com.couponbank.dao;

import com.couponbank.models.BankTransaction;

public interface BankServiceDao {

	boolean makeTransaction(BankTransaction bankTransaction); 
	
}
