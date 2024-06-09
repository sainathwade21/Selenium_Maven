package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();

		driver.findElement(By.xpath("//span[@id='srcCode']")).click();
		
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();

		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("pune");
		
		driver.findElement(By.xpath("//div[text()='PNQ']")).click();
			
		driver.findElement(By.xpath("//span[@id='destCode']")).click();
		
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("ayodhya");
		
		driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
		Thread.sleep(2000);
	//date	
		driver.findElement(By.xpath("//span[@id='departureDate']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='calendar__day calendar__activeDay']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='_2HtkP']")).click();
		
		driver.findElement(By.xpath("(//div[@class='hs3a5'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
		
		WebElement a = driver.findElement(By.xpath("//span[@class='_2cP56']/ancestor::section[@id='flightsList']/descendant::div[@class='_3ZFJJ'][1]"));
		
		String FlightName=a.getText();
		System.out.println("FlightName:- "+FlightName);
		
		WebElement b=driver.findElement(By.xpath("//span[@class='_2cP56']/ancestor::section[@id='flightsList']/descendant::div[@class='_2MkSl']"));
		String Price=b.getText();
		System.out.println("Price:- "+Price);
		
		driver.quit();
	}

}
