package BatchExecution;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Ordering sugar from Zomato-Blinkit

public class ZomatoBlinkIt {
	@Test
	public void script() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		WebElement location = driver.findElement(By.xpath("//input[@placeholder='search delivery location']"));
		Thread.sleep(1000);
		location.sendKeys("QSpiders Pune Wakad");
		Thread.sleep(1000);
		location.clear();
		Thread.sleep(1000);
		location.sendKeys("QSpiders Pune Wakad");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'QSpiders Pune Wakad')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/s/']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//header[contains(@class,'etwMDu')]/descendant::input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
		Thread.sleep(1000);

		for(int i=1;i<3;i++)
		{
		driver.findElement(By.xpath("//div[@class='AddToCart___StyledDiv2-sc-17ig0e3-11 hrkaxa']")).click();

		}
		driver.quit();
	}
}
