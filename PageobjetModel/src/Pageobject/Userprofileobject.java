package Pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userprofileobject {

	@FindBy(id = "txtUsername")
	public static WebElement username;

	@FindBy(id = "txtPassword")
	public static WebElement password;

	@FindBy(id = "btnLogin")
	public static WebElement loginbutton;

	@FindBy(id = "menu_admin_viewAdminModule")
	public static WebElement admin;

	@FindBy(id = "btnAdd")
	public static WebElement add;

	@FindBy(id = "systemUser_employeeName_empName")
	public static WebElement empname;

	@FindBy(id = "systemUser_userName")
	public static WebElement username1;

	@FindBy(id = "systemUser_password")
	public static WebElement password1;

	@FindBy(id = "systemUser_confirmPassword")
	public static WebElement passwordcomp;

	@FindBy(id = "btnSave")
	public static WebElement save;

	/*
	 * public static WebElement admin(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("menu_admin_viewAdminModule"));
	 * 
	 * }
	 * 
	 * public static WebElement add(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("btnAdd"));
	 * 
	 * }
	 * 
	 * public static WebElement empname(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("systemUser_employeeName_empName"));
	 * 
	 * }
	 * 
	 * public static WebElement username1(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("systemUser_userName"));
	 * 
	 * }
	 * 
	 * public static WebElement password1(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("systemUser_password"));
	 * 
	 * }
	 * 
	 * public static WebElement passwordcomp(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("systemUser_confirmPassword"));
	 * 
	 * }
	 * 
	 * public static WebElement save(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("btnSave"));
	 * 
	 * }
	 */}
