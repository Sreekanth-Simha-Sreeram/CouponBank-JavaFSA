package com.couponbank.services;

import com.couponbank.models.BankTransaction;

public interface BankService {
	
boolean makeTransaction(BankTransaction bankTransaction); 

}
