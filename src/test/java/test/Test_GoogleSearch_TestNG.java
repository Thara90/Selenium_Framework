package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_GoogleSearch_TestNG {
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	
	@BeforeTest
	public void setUpTest() {		
		spark = new ExtentSparkReporter("Report.html");		
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	}
	
	@Test
	public void googleSearch() {
		ExtentTest test = extent.createTest("Test Google Search");
		
		test.log(Status.INFO,"Starting test case");
		driver.get("https://www.google.com/");
		test.log(Status.PASS,"Browser launched");
		
		driver.findElement(By.name("q")).sendKeys("surf in weligama");
		test.log(Status.PASS,"Enterted search text");
		//hit enter button
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test.log(Status.PASS,"Pressed enter");
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		
		System.out.println("test completed successfully");
		extent.flush();
	}
	

}
