package Testcase;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommanFuction.Commen_fuction_Pro;
import Pageobject.LoginPageObject;

public class LoginTest extends Commen_fuction_Pro {
	
	@Test
	public void login_page_test() {
		
		
		PageFactory.initElements(driver,LoginPageObject.class);
		
		LoginPageObject.Username.sendKeys(properties.getProperty("username"));
		
		LoginPageObject.password.sendKeys(properties.getProperty("password"));
		
		LoginPageObject.Loginbutton.click();

		/*PageFactory.initElements(driver, LoginPageObject.class);

		LoginPageObject.Username.sendKeys("mngr226415");

		LoginPageObject.password.sendKeys("yqyrUdA");

		LoginPageObject.Loginbutton.click();
*/
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