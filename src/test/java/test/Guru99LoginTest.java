package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Guru99LoginPage;

public class Guru99LoginTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
	
		googleSearch();
	}
	
	public static void googleSearch() {
		
		//setup chrome driver with webDriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//launch base url
		String base_url = "https://www.demo.guru99.com/V4/";
		driver.get(base_url);
		
		String username = "mngr441743";
		Guru99LoginPage.username(driver).sendKeys("mngr441743");
		Guru99LoginPage.password(driver).sendKeys("ydYdAvY");
		Guru99LoginPage.buttonLogin(driver).click();
		
		String ActualTitle = Guru99LoginPage.getTitle(driver).getText();
		String ExpectedTitle = "Manger Id : "+username;
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		driver.close();
		driver.quit();
		
		System.out.println("test completed successfully");
	}
}
