package com.cuponbank.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.couponbank.common.UserAlreadyExistException;
import com.couponbank.common.UserDoesNotExistException;
import com.couponbank.models.User;
import com.couponbank.services.LoginService;

import junit.framework.Assert;

public class TestException {
	
	@Test
	    public void testForUserRegistration() throws UserAlreadyExistException 
	    {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
		   User user=new User();
		   user.setUserId(1);
		user.setUserName("poojaSharma");
		user.setStatus("example");
		user.setRole("user");
		user.setPassword("1234hello");
  	 LoginService loginservice = (LoginService) context.getBean("LoginService");
   loginservice.register(user);
   Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
        }

	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	   User user=new User();
	   user.setUserId(1);
	user.setUserName("poojaSharma");
	user.setStatus("example");
	user.setRole("user");
	user.setPassword("1234hello");
	 LoginService loginservice = (LoginService) context.getBean("LoginService");
loginservice.login(user.getUserName(),user.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user already exists !..please login");
    
	
	 }

}
