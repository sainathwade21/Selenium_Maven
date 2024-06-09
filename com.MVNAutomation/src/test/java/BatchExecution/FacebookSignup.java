package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Facebook signup using name locator

public class FacebookSignup {
	@Test
	public void script() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("_6lti")).click();

		driver.findElement(By.name("firstname")).sendKeys("Technical");

		driver.findElement(By.name("lastname")).sendKeys("Guruji");

		driver.findElement(By.name("reg_email__")).sendKeys("9658743225");

		driver.findElement(By.name("reg_passwd__")).sendKeys("pass@123");
		
		//driver.findElement(By.name("birthday_day")).sendKeys("22");

		//driver.findElement(By.name("birthday_month")).sendKeys("Apr");

		driver.findElement(By.className("_8esa")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		driver.quit();

	}

}
