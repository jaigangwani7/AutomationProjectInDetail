package com.AutomationProject.testScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationProject.library.Browser;
import com.AutomationProject.library.Constant;
import com.AutomationProject.library.WaitTime;
import com.AutomationProject.pages.LoginPage;
import com.AutomationProject.pages.NavigationMenu;
import com.AutomationProject.pages.ProductCategoryPage;
import com.AutomationProject.pages.ShoppinCartSummaryPage;

public class TillPaymentPage 
{
	@BeforeMethod
	public void preCondition()
	{
		Browser.getBrowser("chrome");
		Constant.driver.get(Constant.url);
		WaitTime.impliciteWait(10);
	}
	@Test
	public void testTillPaymentPage()
	{
		LoginPage loginTest = new LoginPage();
		loginTest.loginToApplication(Constant.userName,Constant.passWord);
		NavigationMenu menu = new NavigationMenu();
		menu.mouseOver("Women");
		menu.clickOnIntem("Women");
		ProductCategoryPage page = new ProductCategoryPage();
		WaitTime time = new WaitTime();
		time.explicitlyWaitTimeWaitTime(10, "//*[@id='center_column']/ul/li[4]/div/div[2]/div[2]/a[1]/span");
		page.clickOnAddToCart();
		
		time.explicitlyWaitTimeWaitTime(10, "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
		page.clickOnProceedTocheckOut();
		
		ShoppinCartSummaryPage shop = new ShoppinCartSummaryPage();
		shop.clickOnProceedTocheckOutInCart();
		shop.clickOnProceedTocheckOutInAddress();
		shop.clickOnTermsOfService();
		shop.clickOnProceedTocheckOutInShipping();
	}
}
