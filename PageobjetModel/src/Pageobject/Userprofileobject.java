package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Userprofileobject {
	
	
	 public static  WebElement admin(WebDriver driver) {
		
		return driver.findElement(By.id("menu_admin_viewAdminModule"));
		
	}
	
	 public static WebElement add(WebDriver driver) {
		
		return driver.findElement(By.id("btnAdd"));
		
	}
	
	 public static WebElement empname(WebDriver driver) {
		
		return driver.findElement(By.id("systemUser_employeeName_empName"));
		
	}
	
	 public static WebElement username1(WebDriver driver) {
		
		return driver.findElement(By.id("systemUser_userName"));
		
	}
	
	 public static WebElement password1(WebDriver driver) {
		
		return driver.findElement(By.id("systemUser_password"));
		
	}
	
	 public static WebElement passwordcomp(WebDriver driver) {
		
		return driver.findElement(By.id("systemUser_confirmPassword"));
		
	}
	
	 public static WebElement save(WebDriver driver) {
		
		return driver.findElement(By.id("btnSave"));
		
	}
}
