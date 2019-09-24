package DemoDatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestDataDriven {

	String[][] data = null;

	@DataProvider(name = "logintest")
	public String[][] dataprovider() throws BiffException, IOException {

		data = exceldata();
		return data;

	}

	public String[][] exceldata() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\testdata1.xls");

		Workbook workbook = Workbook.getWorkbook(excel);

		Sheet sheet = workbook.getSheet(0);

		int rowcount = sheet.getRows();

		int coulmcount = sheet.getColumns();

		String testdata[][] = new String[rowcount - 1][coulmcount];

		for (int i = 1; i < rowcount; i++) {

			for (int j = 0; j < coulmcount; j++) {

				testdata[i - 1][j] = sheet.getCell(j, i).getContents();

			}

		}
		return testdata;

	}

	@Test(dataProvider = "logintest")
	
	public void testcase(String username, String password) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();

		WebElement textname = driver.findElement(By.id("txtUsername"));

		textname.sendKeys("username");

		WebElement testpassword = driver.findElement(By.id("txtPassword"));

		testpassword.sendKeys("password");

		WebElement clickbutton = driver.findElement(By.id("btnLogin"));

		clickbutton.click();

		driver.quit();

	}

}
