package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;
import com.nopcommerce.pageObjects.addCust;

public class TC_addCustTest_003 extends BaseClass
{
	@Test
	public void addCustTest()
	{
		driver.get(baseURL);
		
        LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("User provided"); //logger msg
		
		lp.setPassword(password);
		logger.info("Password provided");//logger msg
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg
		
		addCust addcust = new addCust(driver);
		
		addcust.clickcustmenu();
		logger.info("customer is Clicked");
		addcust.clickcustinfo();
		logger.info("customerinfo is Clicked");
		addcust.clickonadd();
		logger.info("add is Clicked");
		addcust.clickinfo();
		logger.info("+ is Clicked");
		String email = randomestring() + "@gmail.com";
		addcust.textmail(email);
		logger.info("Email is Clicked");
		addcust.setpass("Pass123");
		logger.info("Password is Clicked");
		
		addcust.textfirst("Raj");
		logger.info("First Name is Clicked");
		addcust.textlast("Kumar");
		logger.info("Last Name is Clicked");
		
		
		
	}



}
