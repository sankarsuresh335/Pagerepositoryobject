package Testcase;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobject.Loginpageobject;

public class Loginpage {

	@Test
	public void loginpagemymethod() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

		
		PageFactory.initElements(driver,Loginpageobject.class);
		

		Loginpageobject.username.sendKeys("Admin");
		Loginpageobject.password.sendKeys("admin123");
		Loginpageobject.loginbutton.click();
		
		
		

	/*	WebElement username = driver.findElement(By.id("txtUsername"));

		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));

		password.sendKeys("admin123");

		WebElement clickbutton = driver.findElement(By.id("btnLogin"));

		clickbutton.click();
*/
	}

}