package com.PageFactory;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMDemo.LoginPage;
import POMDemo.LoginTest;

public class LoginTest1 {
	Logger log=Logger.getLogger(LoginTest.class);
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void setUp() {
		log.info("---------------------------------------");
		log.info("initionalizing browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		log.info("chrome browser opened");
		driver.get("file:///C:/Users/Akshay/Downloads/software/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		log.info("JBK offline application launched");
		lp = new LoginPage(driver);
		dp=new DashboardPage(driver);
		log.info("all webElements browser");
	}
	@AfterMethod
	public void tearDown() {
		log.info("Closing the browser");
		driver.close();
	}

	@Test // Tester working on Login page
	public void validLoginTest() {
		log.info("Logging in to the JBK Application");
		log.warn("do not enter numeric username");
		lp.enterUname("kiran@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
		log.info("user loggin in to the Jbk Application");
	}

	@Test // Tester working on DashBourd Page
	public void test02() {
		log.info("User loggin in with invalid credentioal");
		lp.validLogin();
		log.info("user will not logged in to application");
		Assert.assertEquals(driver.getTitle(), lp.getTitle());
	}
	@Test
	public void test03() {
		log.info("Test 3");
	}
	
	}
	