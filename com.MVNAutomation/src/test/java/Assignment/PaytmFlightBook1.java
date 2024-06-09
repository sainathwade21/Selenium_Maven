package Assignment;

import java.time.Duration;
import java.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
	// By using current date

public class PaytmFlightBook1 {   
	public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://paytm.com/");

// Click on flight png	
	driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();

//From
	driver.findElement(By.xpath("//span[@id='srcCode']")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("pnq");
	driver.findElement(By.xpath("//div[text()='PNQ']")).click();
	
//to	
	driver.findElement(By.xpath("//span[@id='destCode']")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("ayodhya");
	driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
	
//date	
	LocalDate currentDate = LocalDate.now();
	int date =currentDate.getDayOfMonth();
	driver.findElement(By.xpath("//span[@id='departureDate']")).click();
	driver.findElement(By.xpath("//table[@class='calendar']/descendant::div[text()='"+date+"']")).click();

//Traveller	
	driver.findElement(By.xpath("//span[@class='_2HtkP']")).click();
	driver.findElement(By.xpath("(//div[@class='hs3a5'])[1]")).click();

	//search flight
	driver.findElement(By.xpath("//button[@id='flightSearch']")).click();

//printing flight details 	
	WebElement fligthName = driver.findElement(By.xpath("//span[@class='_2cP56']/ancestor::section[@id='flightsList']/descendant::div[@class='_3ZFJJ'][1]"));
	System.out.println("FlightName:- "+fligthName.getText());
	WebElement price=driver.findElement(By.xpath("//span[@class='_2cP56']/ancestor::section[@id='flightsList']/descendant::div[@class='_2MkSl']"));
	System.out.println("Price:- "+price.getText());
	}

}
