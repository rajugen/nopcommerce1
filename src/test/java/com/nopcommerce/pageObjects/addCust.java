package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCust 
{
public WebDriver ldriver;
	
	public addCust(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")
	@CacheLookup
	WebElement lkncust;
	
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	@CacheLookup
	WebElement lkncustinfo;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	@CacheLookup
	WebElement lknadd;
	
	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[1]/div[2]/button/i")
	@CacheLookup
	WebElement lkninfo;
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpass;
	
	@FindBy(id="FirstName")
	@CacheLookup
	WebElement txtfirst;
	
	@FindBy(id="LastName")
	@CacheLookup
	WebElement txtlast;
	
	public void clickcustmenu()
	{
		lkncust.click();
	}
	
	public void clickcustinfo()
	{
		lkncustinfo.click();
	}
	
	public void clickonadd()
	{
		lknadd.click();
	}
	
	public void clickinfo()
	{
		lkninfo.click();
	}
	
	public void textmail(String mail)
	{
		txtmail.sendKeys(mail);
	}
	
	public void setpass(String password)
	{
		txtpass.sendKeys(password);
	}
	
	public void textfirst(String first)
	{
		txtfirst.sendKeys(first);
	}
	
	public void textlast(String last)
	{
		txtlast.sendKeys(last);
	}
}
