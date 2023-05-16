package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_GoogleSearch {
	public static void main(String[] args) {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		extent.attachReporter(spark);
		
		ExtentTest test1 = extent.createTest("Test Google Search 1");
		
		//extent.createTest("MyFirstTest")
		  //.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		test1.log(Status.INFO,"Starting test case");
		driver.get("https://www.google.com/");
		test1.log(Status.PASS,"Browser launched");
		
		driver.findElement(By.name("q")).sendKeys("surf in weligama");
		test1.log(Status.PASS,"Enterted search text");
		//hit enter button
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test1.log(Status.PASS,"Pressed enter");
		
		driver.close();
		driver.quit();
		test1.log(Status.PASS,"Browser closed");
	
		test1.log(Status.INFO,"Test completed");
		extent.flush();
		
		 //second test case
		ExtentTest test2 = extent.createTest("Test Google Search 2");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		
		test2.log(Status.INFO,"Starting test case");
		driver1.get("https://www.google.com/");
		test2.log(Status.PASS,"Browser launched");
		
		driver1.findElement(By.name("q")).sendKeys("surf in weligama");
		test2.log(Status.PASS,"Enterted search text");
		//hit enter button
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test2.log(Status.FAIL,"Pressed enter");
		
		driver1.close();
		driver1.quit();
		test2.log(Status.PASS,"Browser closed");
	
		test2.log(Status.INFO,"Test completed");
		extent.flush();
	}

}
