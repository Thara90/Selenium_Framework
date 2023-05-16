package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99LoginPage {
	
	private static WebElement element = null;

	public static WebElement username(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='uid']"));
		return element;
		
	}
	
	public static WebElement password(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='password']"));
		return element;
		
	}
	
	public static WebElement buttonLogin(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		return element;
		
	}
	
	public static WebElement getTitle(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("tr[class='heading3'] td"));
		return element;
		
	}

}
