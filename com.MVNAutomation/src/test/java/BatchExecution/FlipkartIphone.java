package BatchExecution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
//Fetching all details Using findElements (for loop)

public class FlipkartIphone {   
	
	@Test
	public void script() throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone",Keys.ENTER);
	Thread.sleep(2000);

//Fetching all details of the product name and price
	
	List<WebElement> Name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	Thread.sleep(1000);
	List<WebElement> Price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	
	for(int i=0;i<Name.size();i++)
	{
		System.out.println(i+" > "+Name.get(i).getText()+"________"+Price.get(i).getText());
	}
	driver.quit();
}

}
