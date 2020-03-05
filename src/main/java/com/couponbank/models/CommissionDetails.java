package com.couponbank.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="CommissionDetails")

public class CommissionDetails {
	
	   @Id
	   @Column(name="commissionId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int commissionId;
	 
	 @Column(name="transactionId")
	int transactionId;
	 
	 @Column(name="commissionFare")
	int commissionFare;
	 
	 @Column(name="dateTime")
	Date dateTime;
	 
	 @Column(name="userId")
	int userId;
	 
	public int getCommissionId() {
		return commissionId;
	}
	public void setCommissionId(int commissionId) {
		this.commissionId = commissionId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getCommissionFare() {
		return commissionFare;
	}
	public void setCommissionFare(int commissionFare) {
		this.commissionFare = commissionFare;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	

}
