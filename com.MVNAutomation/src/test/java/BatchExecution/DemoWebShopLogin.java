package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Login to demowebshop using absolute xpath

public class DemoWebShopLogin {
	@Test
	public void script() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
	
	driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("sainathwade384@gmail.com");
	
	driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/input")).sendKeys("Pass@123");

	driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")).click();


	driver.quit();
}
}
