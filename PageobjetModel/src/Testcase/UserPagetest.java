package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobject.LoginPageObject;
import Pageobject.UserpagePageObject;

public class UserPagetest {

	@Test
	public void New_User_upadte() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");

		PageFactory.initElements(driver, LoginPageObject.class);

		LoginPageObject.Username.sendKeys("mngr226415");

		LoginPageObject.password.sendKeys("yqyrUdA");

		LoginPageObject.Loginbutton.click();

		PageFactory.initElements(driver, UserpagePageObject.class);

		UserpagePageObject.Newcustomer.click();

		UserpagePageObject.Customername.sendKeys("name");

		UserpagePageObject.Genderobject.click();

		UserpagePageObject.cityobject.sendKeys("pondicherry");

		UserpagePageObject.stateobject.sendKeys("phondy");

		UserpagePageObject.phonenrobject.sendKeys("9944236335");

		UserpagePageObject.submmitbutton.click();
	}
}

/*
 * WebElement newcustomer = driver.findElement(By.linkText("New Customer"));
 * 
 * newcustomer.click();
 * 
 * WebElement customername = driver.findElement(By.name("name"));
 * customername.sendKeys("sankar");
 * 
 * WebElement gender = driver.findElement(By.name("rad1"));
 * 
 * gender.click();
 * 
 * WebElement city = driver.findElement(By.name("city"));
 * 
 * city.sendKeys("pondicherry");
 * 
 * WebElement state = driver.findElement(By.name("state"));
 * 
 * state.sendKeys("phondy");
 * 
 * WebElement phonenr = driver.findElement(By.name("telephoneno"));
 * 
 * phonenr.sendKeys("9944236335");
 * 
 * WebElement summbmit = driver.findElement(By.name("sub"));
 * 
 * summbmit.click();
 * 
 */
