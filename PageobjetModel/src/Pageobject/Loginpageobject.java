package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobject {

	@FindBy(id="txtUsername")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	@FindBy(id="btnLogin")
	public static WebElement loginbutton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static WebElement username (WebDriver driver) {

		return driver.findElement(By.id("txtUsername"));

	}

	 public static WebElement password (WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));

	}

	 public static WebElement loginbutton (WebDriver driver) {
btnLogin
		return driver.findElement(By.id("btnLogin"));

	}
*/
}
