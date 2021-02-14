package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	WebDriver driver;

	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

//This gives the webelements
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath = "//button")
	private WebElement lgnBtn;
	
	
	
	public void enterUname(String text) {
		uname.sendKeys(text);
	}

	public void enterPass(String text) {
		pass.sendKeys(text);
	}

	public void clickLogin() {
		lgnBtn.click();
	}
	public String getTitle() {
		return driver.getTitle();
	}

	public void validLogin() {
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickLogin();
	}

}

