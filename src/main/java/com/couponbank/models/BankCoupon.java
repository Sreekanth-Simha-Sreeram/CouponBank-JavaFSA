package com.couponbank.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="BankCoupon")

public class BankCoupon {
	 @Id
	   @Column(name="couponId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
       int couponId;
	 
	 @Column(name="userId")
    int userId;
	 
	 @Column(name="couponImage")
     String couponImage;
	
	 @Column(name="couponNumber")
    int couponNumber;
	 
	 @Column(name="couponValue")
     int couponValue;
	 
	 @Column(name="createdAt")
     Date createdAt;
	 
public int getCouponId() {
	return couponId;
}
public void setCouponId(int couponId) {
	this.couponId = couponId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getCouponImage() {
	return couponImage;
}
public void setCouponImage(String couponImage) {
	this.couponImage = couponImage;
}
public int getCouponNumber() {
	return couponNumber;
}
public void setCouponNumber(int couponNumber) {
	this.couponNumber = couponNumber;
}
public int getCouponValue() {
	return couponValue;
}
public void setCouponValue(int couponValue) {
	this.couponValue = couponValue;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

}
