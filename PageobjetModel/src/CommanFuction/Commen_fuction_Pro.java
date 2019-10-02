package CommanFuction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commen_fuction_Pro {

	public static Properties properties = null;

	public static WebDriver driver = null;

	public Properties loadpropertiesfile() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("config.properties");

		properties = new Properties();

		properties.load(fileInputStream);

		return properties;

	}

	@BeforeSuite
	public void lunchbrowers() throws IOException {

		loadpropertiesfile();

		String browser = properties.getProperty("browser");

		String url = properties.getProperty("url");

		String driverlocation = properties.getProperty("Driverlocation");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void tearbrower() {

		
		  driver.quit();
		 

	}

}
