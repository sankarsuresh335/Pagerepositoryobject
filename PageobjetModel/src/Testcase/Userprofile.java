package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Pageobject.Loginpageobject;
import Pageobject.Userprofileobject;

public class Userprofile {

	@Test
	public void usermethod() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

		Loginpageobject.username(driver).sendKeys("Admin");

		Loginpageobject.password(driver).sendKeys("admin123");

		Loginpageobject.loginbutton(driver).click();

		Userprofileobject.admin(driver).click();

		Userprofileobject.add(driver).click();

		Userprofileobject.empname(driver).sendKeys("sankar");

		Userprofileobject.username1(driver).sendKeys("sankarsuresh");

		Userprofileobject.password1(driver).sendKeys("Qualityqac@1988");

		Userprofileobject.passwordcomp(driver).sendKeys("Qualityqac@1988");

		Userprofileobject.save(driver).click();

		/*
		 * WebElement username = driver.findElement(By.id("txtUsername"));
		 * 
		 * username.sendKeys("Admin");
		 * 
		 * // password
		 * 
		 * WebElement password = driver.findElement(By.id("txtPassword"));
		 * 
		 * password.sendKeys("admin123");
		 * 
		 * // click opt
		 * 
		 * WebElement clickbutton = driver.findElement(By.id("btnLogin"));
		 * 
		 * clickbutton.click();
		 * 
		 * WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		 * 
		 * admin.click();
		 * 
		 * WebElement add = driver.findElement(By.id("btnAdd"));
		 * 
		 * add.click();
		 * 
		 * WebElement empname =
		 * driver.findElement(By.id("systemUser_employeeName_empName"));
		 * 
		 * empname.sendKeys("sankar");
		 * 
		 * WebElement username1 = driver.findElement(By.id("systemUser_userName"));
		 * 
		 * username1.sendKeys("sankarsuresh");
		 * 
		 * WebElement password1 = driver.findElement(By.id("systemUser_password"));
		 * 
		 * password1.sendKeys("Qualityqac@1988");
		 * 
		 * WebElement passwordcomp =
		 * driver.findElement(By.id("systemUser_confirmPassword"));
		 * 
		 * passwordcomp.sendKeys("Qualityqac@1988");
		 * 
		 * 
		 * WebElement save=driver.findElement(By.id("btnSave"));
		 * 
		 * save.click();
		 * 
		 */

	}

}
