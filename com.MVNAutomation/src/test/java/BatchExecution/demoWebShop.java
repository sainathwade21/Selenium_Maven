package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Registering on demowebshop

public class demoWebShop {
	
	@Test
	public void script() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("sai");
		
		driver.findElement(By.id("LastName")).sendKeys("wade");
		
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("abcd@123");
	
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd@123");
		
		driver.findElement(By.id("register-button")).click();
		
		driver.quit();

	}

}
