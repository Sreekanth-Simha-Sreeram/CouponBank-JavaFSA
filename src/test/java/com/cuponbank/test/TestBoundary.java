package com.cuponbank.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.couponbank.models.BankCoupon;
import com.couponbank.models.User;



public class TestBoundary {

	 @Test
	    public void testpasswordLength()
	    {
	        User user=new User();
	        user.setUserId(1);
	        user.setEmail("example@example.com");
	        user.setPassword("123hello1234");
	        user.setRole("admin");
	        user.setStatus("outskirt");
	        user.setUserName("james");
	        
	        		
	        int passwordLength=10;
	assertEquals(passwordLength,user.getPassword().length());


	    }
	 
	 @Test
	    public void testPhoneNumberLength()
	    {
	        User user=new User();
	        user.setUserId(1);
	        user.setEmail("example@example.com");
	        user.setPassword("123hello1234");
	        user.setRole("admin");
	        user.setStatus("outskirt");
	        user.setUserName("james");
	        user.setPhoneNumber(1234567890);
	        		
	        int phoneNumberLength=10;
	        
	        
	        int getLengthOfNumber=(Integer.toString(user.getPhoneNumber()).length());
	assertEquals( phoneNumberLength, getLengthOfNumber);


	    }
	 
	 @Test
	    public void testCouponValueGreaterThan20()
	    {
	     BankCoupon bankcoupon= new BankCoupon();
	     bankcoupon.setCouponId(12);
	     bankcoupon.setCouponImage("jpeg");
	     bankcoupon.setCouponNumber(2);
	     bankcoupon.setCouponValue(10);
	     
	     boolean requiredcouponvalue=(bankcoupon.getCouponValue()>=20);
	     assertEquals( requiredcouponvalue,bankcoupon.getCouponValue());
	    }
	 @Test
	    public void testUserNameLength()
	    {
	    User user=new User();
	    user.setUserId(1);
	    user.setUserName("poojaSharma");
	    user.setStatus("example");
	    user.setRole("user");
	    user.setPassword("1234hello");
	    
	    int maxChar=5;
	    boolean usernamelength=((user.getUserName().length())>=maxChar);
	    assertEquals( usernamelength,user.getUserName().length());
	    }
	 
}
