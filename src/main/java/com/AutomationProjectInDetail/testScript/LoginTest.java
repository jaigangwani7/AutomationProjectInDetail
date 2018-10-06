package com.AutomationProjectInDetail.testScript;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationProjectInDetail.helper.assertion.AssertionHelper;
import com.AutomationProjectInDetail.helper.browserConfiguration.config.ObjectReader;
import com.AutomationProjectInDetail.helper.logger.LoggerHelper;
import com.AutomationProjectInDetail.pageObject.LoginPage;
import com.AutomationProjectInDetail.testbase.TestBase;

public class LoginTest extends TestBase
{
private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	
	@Test(description="Login test with valid credentials")
	public void testLoginToApplication(){
		getApplicationUrl(ObjectReader.reader.getUrl());
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.loginToApplication(ObjectReader.reader.getUserName(), ObjectReader.reader.getPassword());
		
		boolean status = loginPage.verifySuccessLoginMsg();
		
		AssertionHelper.updateTestStatus(status);
	}
}
