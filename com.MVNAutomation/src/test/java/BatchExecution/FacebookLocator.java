package BatchExecution;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Facebook Login

public class FacebookLocator {
	@Test
	public void script() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("9876543210");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("abcdef");
		WebElement button=driver.findElement(By.name("login"));
		button.click();	
		
		driver.quit();
	}

}
