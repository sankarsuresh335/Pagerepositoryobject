package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserpagePageObject {

	@FindBy(name = "uid")
	public static WebElement Username;

	@FindBy(name = "password")
	public static WebElement password;

	@FindBy(name = "btnLogin")
	public static WebElement Loginbutton;

	@FindBy(linkText = "New Customer")
	public static WebElement Newcustomer;

	@FindBy(name = "name")
	public static WebElement Customername;

	@FindBy(name = "rad1")
	public static WebElement Genderobject;

	@FindBy(name = "city")
	public static WebElement cityobject;

	@FindBy(name = "state")
	public static WebElement stateobject;

	@FindBy(name = "telephoneno")
	public static WebElement phonenrobject;

	@FindBy(name = "sub")
	public static WebElement submmitbutton;

	/*
	 * public static WebElement Newcustomer(WebDriver driver) { return
	 * driver.findElement(By.linkText("New Customer"));
	 * 
	 * }
	 * 
	 * public static WebElement Customername(WebDriver driver) { return
	 * driver.findElement(By.name("name"));
	 * 
	 * }
	 * 
	 * public static WebElement Genderobject(WebDriver driver) {
	 * 
	 * return driver.findElement(By.name("rad1"));
	 * 
	 * }
	 * 
	 * public static WebElement cityobject(WebDriver driver) { return
	 * driver.findElement(By.name("city"));
	 * 
	 * }
	 * 
	 * public static WebElement stateobject(WebDriver driver) {
	 * 
	 * return driver.findElement(By.name("state"));
	 * 
	 * }
	 * 
	 * public static WebElement phonenrobject(WebDriver driver) { return
	 * driver.findElement(By.name("telephoneno"));
	 * 
	 * }
	 * 
	 * public static WebElement submmitbutton(WebDriver driver) {
	 * 
	 * return driver.findElement(By.name("sub"));
	 * 
	 * }
	 */}
