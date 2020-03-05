package com.couponbank.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BankTransaction")

public class BankTransaction {
	 @Id
	   @Column(name="transactionId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
int transactionId;
	 
	 @Column(name="userId")
   int userId;
	 
	 @Column(name="couponId")
   int couponId;
	 
	 @Column(name="recievedFrom")
   String recievedFrom;
	 
	 @Column(name="paidTo") 
   String paidTo;
	 
	 @Column(name="dateTime")
    Date dateTime;
	
	 @Column(name="status")
     String status;

	 @Column(name="couponValue")
	 int couponValue;
	 
	 @Column(name="creditAmount")
	  int creditAmount;
	  
	
	@Column(name="debitAmount")
	  int debitAmount;
	  
	  @Column(name="accountBalance")
	  int accountBalance;
	  
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getCouponId() {
	return couponId;
}
public void setCouponId(int couponId) {
	this.couponId = couponId;
}
public String getRecievedFrom() {
	return recievedFrom;
}
public void setRecievedFrom(String recievedFrom) {
	this.recievedFrom = recievedFrom;
}
public String getPaidTo() {
	return paidTo;
}
public void setPaidTo(String paidTo) {
	this.paidTo = paidTo;
}
public Date getDateTime() {
	return dateTime;
}
public void setDateTime(Date dateTime) {
	this.dateTime = dateTime;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getCouponValue() {
	return couponValue;
}
public void setCouponValue(int couponValue) {
	this.couponValue = couponValue;
}

public int getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(int creditAmount) {
		this.creditAmount = creditAmount;
	}
	public int getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(int debitAmount) {
		this.debitAmount = debitAmount;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

}
