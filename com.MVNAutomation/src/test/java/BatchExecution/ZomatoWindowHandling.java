package BatchExecution;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZomatoWindowHandling {
	@Test
	public void script() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.zomato.com/india");
	
	WebElement social = driver.findElement(By.xpath("//div[@name='Social links']"));
	
	// Explicit type casting to perform scrolling actions
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", social);
	
	// Common xpath of all the links
	List<WebElement> socialLinks = driver.findElements(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo']"));

	// Click on all the social links
	for(WebElement link:socialLinks) {
		link.click();
	}
	
	Set<String> allId = driver.getWindowHandles();
	
	// Closing all the windows except LinkedIn
	for(String Id:allId) {
		driver.switchTo().window(Id);
		
		if (driver.getTitle().equals("Zomato | LinkedIn")) {
						
		}
		else {
			driver.close();
		}
	}
	driver.quit();
	
}
}
