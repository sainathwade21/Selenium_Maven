package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Automating end to end scenario of demowebshop

public class DemoWebShop_E2E {
	
	@Test
	public void script() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("sainathwade384@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pass@123");
		
		driver.findElement(By.xpath("//div[@class='buttons']/descendant::input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='master-wrapper-main']/descendant::a[@href='/books']")).click();
		
		driver.findElement(By.xpath("//div[@class='add-info']/descendant::input[@class='button-2 product-box-add-to-cart-button']")).click();
		driver.findElement(By.xpath("//li[@id='topcartlink']/descendant::span[@class='cart-label']")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.xpath("//select[@id='CountryId']")).click();
		driver.findElement(By.xpath("//option[@value='41']")).click();
		
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='buttons']/descendant::input[@class='button-1 new-address-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		driver.findElement(By.xpath("//a[text()='Click here for order details.']")).click();
		driver.findElement(By.xpath("//a[text()='PDF Invoice']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click(); 
		
		driver.quit();
	}

}

