package com.AutomationProject.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProject.library.Constant;

public class ProductCategoryPage 
{
	@FindBy(xpath="//*[@id='layered_block_left']/p")
	public WebElement catalogTextObj;
	
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/h2")
	public WebElement productAddedSucessfully;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[4]/div/div[2]/div[2]/a[1]/span")
	public WebElement addToCart;
	
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	public WebElement proceedToCheckOut;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li")
	List<WebElement> totalProducts;
	
	@FindBy(xpath="//*[@id='selectProductSort']")
	public WebElement sortBy;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li/div/div[2]/div/span[1]")
	List<WebElement> allpriceElements;
	
	public ProductCategoryPage()
	{
		PageFactory.initElements(Constant.driver, this);
	}
	
	public void clickOnAddToCart(){
		
		addToCart.click();
	}
	
	public void clickOnProceedTocheckOut(){
		
		proceedToCheckOut.click();
	}
}
