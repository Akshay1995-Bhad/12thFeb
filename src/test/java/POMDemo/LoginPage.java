package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class LoginPage {

	WebDriver lpdriver;

	public LoginPage(WebDriver driver) {
		this.lpdriver = driver;
	}

//This gives the webelements
	public WebElement getUname() {
		return lpdriver.findElement(By.id("email"));
	}

	public WebElement getPass() {
		return lpdriver.findElement(By.id("password"));
	}

	public WebElement getLoginBtn() {
		return lpdriver.findElement(By.xpath("//button"));
	}

	public WebElement getLogo() {
		return lpdriver.findElement(By.xpath("//img"));
	}

	// on the basis of webelement we are operating on those elements.
	public void enterUname(String text) {
		getUname().sendKeys(text);
	}

	public void enterPass(String text) {
		getPass().sendKeys(text);
	}

	public void clickLogin() {
		getLoginBtn().click();
	}
	public String getTitle() {
		return lpdriver.getTitle();
	}

	public void validLogin() {
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickLogin();
	}

}