package com.AutomationProject.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AutomationProject.library.Constant;

public class RegistrationPage 
{
	@FindBy(xpath = "//*[@id='id_gender1']")
	public WebElement mrRadioButton;

	@FindBy(xpath = ".//*[@id='id_gender2']")
	public WebElement mrsRadioButton;

	@FindBy(xpath = "//*[@id='customer_firstname']")
	public WebElement firstName;

	@FindBy(xpath = "//*[@id='customer_lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//*[@id='email']")
	public WebElement emailAddress;

	@FindBy(xpath = "//*[@id='passwd']")
	public WebElement password;

	@FindBy(xpath = "//*[@id='days']")
	public WebElement days;

	@FindBy(xpath = "//*[@id='months']")
	public WebElement month;

	@FindBy(xpath = "//*[@id='years']")
	public WebElement year;

	@FindBy(xpath = "//*[@id='firstname']")
	public WebElement yourAddressFirstName;

	@FindBy(xpath = "//*[@id='lastname']")
	public WebElement yourAddressLastName;

	@FindBy(xpath = "//*[@id='company']")
	public WebElement yourAddressCompany;

	@FindBy(xpath = "//*[@id='address1']")
	public WebElement address;

	@FindBy(xpath = "//*[@id='address2']")
	public WebElement address2;

	@FindBy(xpath = "//*[@id='city']")
	public WebElement yourAddressCity;

	@FindBy(xpath = "//*[@id='id_state']")
	public WebElement yourAddressState;

	@FindBy(xpath = "//*[@id='postcode']")
	public WebElement yourAddressPostCode;

	@FindBy(xpath = "//*[@id='id_country']")
	public WebElement additionalInformation;

	@FindBy(xpath = "//*[@id='phone']")
	public WebElement homePhone;

	@FindBy(xpath = "//*[@id='phone_mobile']")
	public WebElement mobilePhone;

	@FindBy(xpath = "//*[@id='alias']")
	public WebElement addressAlias;

	@FindBy(xpath = "//*[@id='submitAccount']")
	public WebElement registration;
	
	public RegistrationPage()
	{
		PageFactory.initElements(Constant.driver, this);
	}
	
	public void setMrRadioButton() {
		
		this.mrRadioButton.click();
	}

	public void setMrsRadioButton() {
		
		this.mrsRadioButton.click();
	}

	public void setFirstName(String firstName) {
		
		this.firstName.sendKeys(firstName);
	}

	public void setLastname(String lastname) {
		
		this.lastname.sendKeys(lastname);
	}

	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress.sendKeys(emailAddress);
	}

	public void setPassword(String password) {
		
		this.password.sendKeys(password);
	}
	
	public void setDay(String day) {
		List<WebElement> days = Constant.driver.findElements(By.xpath("//*[@id='days']/option"));
		Iterator<WebElement> itr = days.iterator();
		while (itr.hasNext()) {
			WebElement c = itr.next();
			String text = c.getText().trim().toString();
			if (text.equals(day)) 
			{
				c.click();
				break;
			}
		}
	}

	public void setMonth(String month) {

		List<WebElement> days = Constant.driver.findElements(By.xpath("//*[@id='months']/option"));
		Iterator<WebElement> itr = days.iterator();
		while (itr.hasNext()) {
			WebElement click = itr.next();
			String text = click.getText().trim();
			if (text.equals(month)) {
				
				click.click();
				break;
			}
		}
	}

	public void setYear(String year) {

		List<WebElement> days = Constant.driver.findElements(By.xpath("//*[@id='years']/option"));
		Iterator<WebElement> itr = days.iterator();
		while (itr.hasNext()) {
			WebElement click = itr.next();
			String text = click.getText().trim();
			if (text.equals(year)) {
				
				click.click();
				break;
			}
		}
	}
	
	public void setYourAddressFirstName(String yourAddressFirstName) {
		
		this.yourAddressFirstName.sendKeys(yourAddressFirstName);
	}

	public void setYourAddressLastName(String yourAddressLastName) {
		
		this.yourAddressLastName.sendKeys(yourAddressLastName);
	}

	public void setYourAddressCompany(String yourAddressCompany) {
		
		this.yourAddressCompany.sendKeys(yourAddressCompany);
	}

	public void setAddress(String address) {
		
		this.address.sendKeys(address);
	}

	public void setAddress2(String address2) {
		
		this.address2.sendKeys(address2);
	}

	public void setYourAddressCity(String yourAddressCity) {
		
		this.yourAddressCity.sendKeys(yourAddressCity);
	}

	public void setYourAddressState(String yourAddressState) {
		
		new Select(this.yourAddressState).selectByVisibleText(yourAddressState);
	}

	public void setYourAddressPostCode(String yourAddressPostCode) {
		
		this.yourAddressPostCode.sendKeys(yourAddressPostCode);
	}

	public void setAdditionalInformation(String additionalInformation) {
		
		this.additionalInformation.sendKeys(additionalInformation);
	}

	public void setHomePhone(String homePhone) {
		
		this.homePhone.sendKeys(homePhone);
	}

	public void setMobilePhone(String mobilePhone) {
		
		this.mobilePhone.sendKeys(mobilePhone);
	}

	public void setAddressAlias(String addressAlias) {
		
		this.addressAlias.sendKeys(addressAlias);
	}

	public void clickRegistration() {
		
		this.registration.click();
	}
	
}
