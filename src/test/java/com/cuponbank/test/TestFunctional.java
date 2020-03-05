package com.cuponbank.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.couponbank.models.BankCoupon;
import com.couponbank.models.BankTransaction;
import com.couponbank.models.CommissionDetails;
import com.couponbank.models.User;
import com.couponbank.services.AdminService;
import com.couponbank.services.BankService;
import com.couponbank.services.LoginService;
import com.couponbank.services.UserService;





public class TestFunctional {
	
	@Test
	public void testGetAllUserList() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	User user = new User();

	user.setUserId(1);
	user.setUserName("meghana");
	user.setEmail("app@gmail.com");
	user.setRole("meghana1234");
	user.setPassword("meghana1234");
	user.setStatus(" ");
	
	AdminService adminservice=(AdminService) context.getBean("AdminService");
	List<User> userfromdb =adminservice.getAllUserList();
	assertEquals(user,userfromdb);
}
	

	@Test
	public void testgetAllTransactionList() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	
	BankTransaction bankTransaction = new BankTransaction();
	
	bankTransaction.setTransactionId(1);
	bankTransaction.setUserId(1);
	bankTransaction.setCouponId(1);
	bankTransaction.setRecievedFrom("Chethana");
	bankTransaction.setPaidTo("meghana");
	bankTransaction.setStatus("");
	bankTransaction.setCouponValue(1000);
	bankTransaction.setCreditAmount(2000);
	bankTransaction.setDebitAmount(1000);
	bankTransaction.setAccountBalance(3000);
	
	AdminService adminservice=(AdminService) context.getBean("AdminService");
	List<BankTransaction> banktransactionfromdb =adminservice.getAllTransactionList();
	assertEquals(bankTransaction,banktransactionfromdb);
}

	@Test
	public void testGetAllCommissionList() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	CommissionDetails commissiondetails = new CommissionDetails();

	commissiondetails.setCommissionId(1);
	commissiondetails.setTransactionId(1);
	commissiondetails.setCommissionFare(100);
	commissiondetails.setUserId(1);
	

	AdminService adminservice=(AdminService) context.getBean("AdminService");
	List<CommissionDetails> commissiondetailsfromdb =adminservice.getAllCommissionList();
	assertEquals(commissiondetails,commissiondetailsfromdb);
}
	
	@Test
	public void testGetCommissionById() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	CommissionDetails commissiondetails = new CommissionDetails();

	commissiondetails.setCommissionId(1);
	commissiondetails.setTransactionId(1);
	commissiondetails.setCommissionFare(100);
	commissiondetails.setUserId(1);
	

	AdminService adminservice=(AdminService) context.getBean("AdminService");
	CommissionDetails commissiondetailsfromdb =adminservice.getCommissionById(commissiondetails.getCommissionId());
	assertEquals(commissiondetails,commissiondetailsfromdb);
}
	
	@Test
	public void tesForValidRegistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	User user=new User();

	user.setUserId(1);
	user.setUserName("meghana");
	user.setEmail("app@gmail.com");
	user.setRole("meghana1234");
	user.setPassword("meghana1234");
	user.setStatus(" ");
	user.setPhoneNumber(1234567891);
	String isRegistered=user.getUserName();
	

	LoginService loginservice=(LoginService) context.getBean("LoginService");
	boolean registration =loginservice.register(user);
	assertNotSame(isRegistered,registration);
}
	
	@Test
	public void tesForValidLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	User user=new User();

	user.setUserId(1);
	user.setUserName("meghana");
	user.setEmail("app@gmail.com");
	user.setRole("meghana1234");
	user.setPassword("meghana1234");
	user.setStatus(" ");
	user.setPhoneNumber(1234567891);
	String isExisting=user.getUserName();
	

	LoginService loginservice=(LoginService) context.getBean("LoginService");
	boolean userdetailsfromdb=loginservice.login(user.getUserName(), user.getPassword());
	assertSame(userdetailsfromdb,isExisting);
}
	@Test
	public void tesForValidResetPassword() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	User user=new User();

	user.setUserId(1);
	user.setUserName("meghana");
	user.setEmail("app@gmail.com");
	user.setRole("meghana1234");
	user.setPassword("meghana1234");
	user.setStatus(" ");
	user.setPhoneNumber(1234567891);
String resetingPassword=user.getPassword();
	

	LoginService loginservice=(LoginService) context.getBean("LoginService");
	boolean userdetailsfromdb=loginservice.resetPassword(user.getUserName(),user.getPassword());
	assertSame(userdetailsfromdb,resetingPassword);
}
	@Test
	public void tesForValidAddCoupon() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	
	BankCoupon bankCoupon = new BankCoupon();
	bankCoupon.setCouponId(12);
	bankCoupon.setCouponImage("jpeg");
	bankCoupon.setCouponNumber(2);
	bankCoupon.setCouponValue(10);
    int couponId=bankCoupon.getCouponId();
	
	UserService userservice=(UserService) context.getBean("UserService");
	boolean bankCouponfromdb=userservice.addCoupon(bankCoupon );
	assertSame(couponId,bankCouponfromdb);
	
	
}
	@Test
	public void tesForValidRequestCoupon() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	
	BankCoupon bankCoupon = new BankCoupon();
	bankCoupon.setCouponId(12);
	bankCoupon.setCouponImage("jpeg");
	bankCoupon.setCouponNumber(2);
	bankCoupon.setCouponValue(10);
    int couponId=bankCoupon.getCouponId();
	
	UserService userservice=(UserService) context.getBean("UserService");
	BankCoupon bankCouponfromdb=userservice.requestCoupon(bankCoupon.getCouponId());
	assertSame(couponId,bankCouponfromdb);
	
	
}
	@Test
	public void tesForValidMakeTransaction() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	
	BankTransaction bankTransaction=new BankTransaction();
	bankTransaction.setAccountBalance(5000);
	bankTransaction.setCouponId(12);
	bankTransaction.setCouponValue(1000);
	bankTransaction.setCreditAmount(2000);
	bankTransaction.setAccountBalance(1000);
	bankTransaction.setDebitAmount(2000);
	bankTransaction.setPaidTo("james");
	bankTransaction.setRecievedFrom("james");
	bankTransaction.setStatus("null");
   
	
	BankService bankservice=(BankService) context.getBean("BankService");
	boolean transactiondetailsfromdb=bankservice.makeTransaction(bankTransaction);
	assertNotNull(transactiondetailsfromdb);
	
	
}
	
}

