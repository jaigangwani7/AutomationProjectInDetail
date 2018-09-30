package com.AutomationProject.testScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationProject.library.Browser;
import com.AutomationProject.library.Constant;
import com.AutomationProject.library.WaitTime;
import com.AutomationProject.pages.LoginPage;
import com.AutomationProject.pages.RegistrationPage;

public class RegistrationTest 
{
	@BeforeMethod
	public void preCondition()
	{
		Browser.getBrowser("chrome");
		Constant.driver.get(Constant.url);
		WaitTime.impliciteWait(10);
	}
	@Test
	public void testRegistration()
	{
		LoginPage loginTest = new LoginPage();
		loginTest.clickOnSignInLink();
		loginTest.enterRegistrationEmail();
		loginTest.clickOnCreateAnAccount();
		RegistrationPage register = new RegistrationPage();
		register.setMrRadioButton();
		register.setFirstName("TESTfirstName");
		register.setLastname("TESTlastname");
		register.setPassword("TESTpassword");
		register.setAddress("TESTaddress");
		register.setDay("5");
		register.setMonth("June");
		register.setYear("2017");
		register.setYourAddressFirstName("TESTyourAddressFirstName");
		register.setYourAddressLastName("TESTyourAddressLastName");
		register.setYourAddressCompany("TESTyourAddressCompany");
		register.setYourAddressCity("TESTyourAddressCity");
		register.setYourAddressState("Alaska");
		register.setYourAddressPostCode("99501");
		register.setMobilePhone("9999999888");
		register.setAddressAlias("TESTaddressAlias");
		register.clickRegistration();
	}
}
