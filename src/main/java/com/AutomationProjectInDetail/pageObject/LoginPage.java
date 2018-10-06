package com.AutomationProjectInDetail.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProjectInDetail.helper.assertion.VerificationHelper;
import com.AutomationProjectInDetail.helper.browserConfiguration.config.ObjectReader;
import com.AutomationProjectInDetail.helper.logger.LoggerHelper;
import com.AutomationProjectInDetail.helper.wait.WaitHelper;
import com.AutomationProjectInDetail.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class LoginPage 
{
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	
	WaitHelper waitHelper;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signin;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement submitLogin;
	
	@FindBy(xpath="//*[@id='center_column']/p")
	WebElement successMsgObject;
	
	@FindBy(xpath="//*[@id='email_create']")
	WebElement registrationEmailAddress;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	WebElement createAnAccount;
	
	@FindBy(xpath="//*[@id='center_column']/h1")
	WebElement authenticate;
	
	@FindBy(xpath="//*[@id='create-account_form']/div/p")
	WebElement createAnAccountMessage;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[2]/a")
	WebElement logout;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(signin,ObjectReader.reader.getExplicitWait());
		new TestBase().getNavigationScreen(driver);
		TestBase.logExtentReport("Login Page Object Created");
	}
	
	public void clickOnSignInLink(){
		log.info("clicked on sign in link...");
		logExtentReport("clicked on sign in link...");
		signin.click();
	}
	
	public void enterEmailAddress(String emailAddress){
		log.info("entering email address...."+emailAddress);
		logExtentReport("entering email address...."+emailAddress);
		this.emailAddress.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		log.info("entering password...."+password);
		logExtentReport("entering password...."+password);
		this.password.sendKeys(password);
	}
	
	public void clickOnSubmitButton(){
		log.info("clicking on submit button...");
		logExtentReport("clicking on submit button...");
		//JavaScriptHelper javaScriptHelper = new JavaScriptHelper(driver);
		//javaScriptHelper.scrollDownVertically();
		//new JavaScriptHelper(driver).scrollDownVertically();
		submitLogin.click();
		//return new NavigationMenu(driver);
	}
	
	public boolean verifySuccessLoginMsg(){
		return new VerificationHelper(driver).isDisplayed(successMsgObject);
	}
	
	public void enterRegistrationEmail(){
		String email = System.currentTimeMillis()+"@gmail.com";
		log.info("entering registration email.."+email);
		registrationEmailAddress.sendKeys(email);	
	}
	
	//public RegistrationPage clickOnCreateAnAccount(){
		//createAnAccount.click();
		//return new RegistrationPage(driver);
	
	
	public void loginToApplication(String emailAddress, String password){
		clickOnSignInLink();
		enterEmailAddress(emailAddress);
		enterPassword(password);
		clickOnSubmitButton();
	}
	
	public void logout(){
		logout.click();
		log.info("clicked on logout link");
		waitHelper.waitForElement(signin, ObjectReader.reader.getExplicitWait());
	}
	
	public void logExtentReport(String s1){
		TestBase.test.log(Status.INFO, s1);
	}
}
