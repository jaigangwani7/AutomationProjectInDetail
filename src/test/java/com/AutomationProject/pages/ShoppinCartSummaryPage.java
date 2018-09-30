package com.AutomationProject.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProject.library.Constant;

public class ShoppinCartSummaryPage 
{
	@FindBy(xpath="//*[@id='columns']/div[1]/span[2]")
	WebElement yourShoppingCart;
	
	@FindBy(xpath="//a[@title='Delete']")
	List<WebElement> quantity_delete;
	
	@FindBy(xpath="//*[contains(text(),'Your shopping cart is empty')]")
	WebElement emptyShoppingCartMsg;
	
	@FindBy(xpath="//*[contains(@class,'cart_navigation clearfix')]/a/span")
	WebElement proceedToCheckOutAtSummary;
	
	@FindBy (xpath="//*[contains(@class,'button btn btn-default button-medium')]/span")
	WebElement proceedToCheckOutAtAddress;
	
	@FindBy (xpath="//*[@id='cgv']")
	WebElement termsOfService;
	
	@FindBy(xpath="//*[@name='processCarrier']/span")
	WebElement proceedToCheckOutAtShipping;

	public ShoppinCartSummaryPage()
	{
		PageFactory.initElements(Constant.driver, this);
	}
	
	public void clickOnProceedTocheckOutInCart()
	{
		proceedToCheckOutAtSummary.click();
	}
	
	public void clickOnProceedTocheckOutInAddress()
	{
		proceedToCheckOutAtAddress.click();
	}
	
	public void clickOnTermsOfService()
	{
		termsOfService.click();
	}
	
	public void clickOnProceedTocheckOutInShipping()
	{
		proceedToCheckOutAtShipping.click();
	}
	
	
}
