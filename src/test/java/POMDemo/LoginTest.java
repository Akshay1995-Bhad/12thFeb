package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage lp;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay/Downloads/software/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		lp = new LoginPage(driver);
	}

	@Test // Tester working on Login page
	public void validLoginTest() {
		lp.enterUname("kiran@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
	}

	@Test // Tester working on DashBourd Page
	public void test02() {
		lp.validLogin();
		Assert.assertEquals(driver.getTitle(), lp.getTitle());
	}
}
