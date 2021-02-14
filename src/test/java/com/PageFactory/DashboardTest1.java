package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMDemo.LoginPage;

public class DashboardTest1 {
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay/Downloads/software/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		lp = new LoginPage(driver);
		dp=new DashboardPage(driver);
	}
	@Test
	public void test03() {
		lp.validLogin();
		dp.getCourses();
}}
