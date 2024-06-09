package BatchExecution;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	//Using findElements

public class PaytmFlightBook1 {   
	@Test
	public void script() throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://paytm.com/");

	
	driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();

//From
	driver.findElement(By.xpath("//span[@id='srcCode']")).click();

	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("pune");
	
	driver.findElement(By.xpath("//div[text()='PNQ']")).click();
	
//to	
	driver.findElement(By.xpath("//span[@id='destCode']")).click();
	
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("ayodhya");
	
	driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
	
//date	
	driver.findElement(By.xpath("//span[@id='departureDate']/ancestor::div[@class='_1xUOn']")).click();
	
	driver.findElement(By.xpath("(//table[@class='calendar']/descendant::div[text()='15'])[2]")).click();

//Traveller	
	driver.findElement(By.xpath("//span[@class='_2HtkP']")).click();
	
	driver.findElement(By.xpath("(//div[@class='hs3a5'])[1]")).click();
//search flight
	driver.findElement(By.xpath("//button[@id='flightSearch']")).click();

	
//printing all details 	
	List<WebElement> list = driver.findElements(By.xpath("//span[text()='Flight Details']/ancestor::div[@class='_3VUCr']"));
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
	}
	driver.quit();
}

}
