package com.AutomationProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationProject.library.Constant;

public class NavigationMenu 
{
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	public WebElement womenMenu;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement dressesMenu;
	
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	public WebElement tshirtsMenu;
	
	public NavigationMenu() 
	{
		
		PageFactory.initElements(Constant.driver, this);
		
	}
	public void mouseOver(String data)
	{
		
		Actions action = new Actions(Constant.driver);
		action.moveToElement(Constant.driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"))).build().perform();
	}
	public void  clickOnIntem(String data)
	{
		
		Constant.driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")).click();
		
	}
}
