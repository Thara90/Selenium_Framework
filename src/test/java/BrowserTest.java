import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		//String projectPath=System.getProperty("user.dir");		
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		
		//webdriver manager automatically manage browser drivers
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("surf in weligama");
		
		//WebElement textBox=driver.findElement(By.xpath("//input[@name='q']"));
		//textBox.sendKeys("surf in weligama");
		
		List<WebElement> listOfInput = driver.findElements(By.xpath("//input"));
		int count = listOfInput.size();
		System.out.println("Count of input element : "+count);
		
		driver.close();
		driver.quit();
	}
}
