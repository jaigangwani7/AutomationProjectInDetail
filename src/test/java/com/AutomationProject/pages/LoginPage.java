package com.AutomationProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProject.library.Constant;



public class LoginPage 
{
	
	
	@FindBy(xpath="//*[contains(@title,'Log in to your customer account')]")
	WebElement signin;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement submitLogin;
	
	@FindBy(xpath="//*[@id='email_create']")
	WebElement registrationEmailAddress;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	WebElement createAnAccount;
	
	
	public LoginPage()
	{
		PageFactory.initElements(Constant.driver, this);
	}
	
	
	public void clickOnSignInLink(){
		
		
	
		signin.click();
	}
	
	public void enterEmailAddress(String emailAddress){
		
		
		
		this.emailAddress.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		
	

		this.password.sendKeys(password);
	}
	
	public void clickOnSubmitButton(){

		submitLogin.click();
		
	}
	
	
	
	public void loginToApplication(String emailid, String pwd)
	{
		clickOnSignInLink();
		enterEmailAddress(emailid);
		enterPassword(pwd);
		clickOnSubmitButton();
	}
	public void enterRegistrationEmail()
	{
		String email = System.currentTimeMillis()+"@gmail.com";
		registrationEmailAddress.sendKeys(email);

	}
	
	public void clickOnCreateAnAccount()
	{
		createAnAccount.click();	

	}
	
}
