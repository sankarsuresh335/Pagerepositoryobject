package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	
	
	@FindBy(name="uid")
	public static WebElement Username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy (name="btnLogin")
	public static WebElement Loginbutton;
	
	
	
	
	
	
	
	/*public static WebElement Username(WebDriver driver) {
		
		return driver.findElement(By.name("uid"));
		
	}
	
	
	public static WebElement password(WebDriver driver) {
		
		return driver.findElement(By.name("password"));
		
	}
	
	public static WebElement Loginbutton (WebDriver driver) {
		
		return driver.findElement(By.name("btnLogin"));
	*/	
		
		
	}
	
	


