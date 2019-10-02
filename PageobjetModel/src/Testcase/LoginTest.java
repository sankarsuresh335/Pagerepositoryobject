package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobject.LoginPageObject;

public class LoginTest {
	@Test
	public void login_page_test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		PageFactory.initElements(driver,LoginPageObject.class);

		LoginPageObject.Username.sendKeys("mngr226415");
		
		LoginPageObject.password.sendKeys("yqyrUdA");
		
		LoginPageObject.Loginbutton.click();
		
		

		/*
		 * WebElement username = driver.findElement(By.name("uid"));
		 * 
		 * username.sendKeys("mngr226415");
		 * 
		 * WebElement password = driver.findElement(By.name("password"));
		 * 
		 * password.sendKeys("yqyrUdA");
		 * 
		 * 
		 * WebElement loginbutton = driver.findElement(By.name("btnLogin"));
		 * 
		 * loginbutton.click();
		 */

	}

}