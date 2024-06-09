package BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetflixLoginPage {

	@Test
	public void script()throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sainathwade384@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@1234");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.quit();
	}

}
