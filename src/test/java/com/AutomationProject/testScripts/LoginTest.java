package com.AutomationProject.testScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationProject.library.Browser;
import com.AutomationProject.library.Constant;
import com.AutomationProject.library.WaitTime;
import com.AutomationProject.pages.LoginPage;


public class LoginTest 
{



		@BeforeMethod
		public void preCondition()
		{
			Browser.getBrowser("chrome");
			Constant.driver.get(Constant.url);
			WaitTime.impliciteWait(10);
		}

		@Test
		public void testValidLogin()
		{
			LoginPage loginTest = new LoginPage();
			loginTest.loginToApplication(Constant.userName,Constant.passWord);
		}
	
				
	

}
