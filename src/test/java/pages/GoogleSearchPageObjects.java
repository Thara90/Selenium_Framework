package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	private static WebDriver driver = null;
	
	By textbox_search = By.name("q");
	
	//By button_search = By.xpath("(//input[@name='btnK'])[1]");
	
	//constructor
	public GoogleSearchPageObjects(WebDriver driver){
		//this.driver - driver in this class
		//driver - driver passes as variable
		this.driver=driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);;
	}
	
	public void clickSearchButton() {
		driver.findElement(textbox_search).sendKeys(Keys.ENTER);;
	}
}
