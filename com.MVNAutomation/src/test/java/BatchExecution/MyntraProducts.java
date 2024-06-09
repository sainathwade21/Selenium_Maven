package BatchExecution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Using findElements (for-each loop)
												
public class MyntraProducts {   
	@Test
	public void script() throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jhumka",Keys.ENTER);
	Thread.sleep(2000);

//Fetching all details of the product name and price
	
	List<WebElement> Brand = driver.findElements(By.xpath("//h3[@class='product-brand']"));
	Thread.sleep(1000);
	List<WebElement> Product = driver.findElements(By.xpath("//h4[@class='product-product']"));
	Thread.sleep(1000);
	List<WebElement> Price = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	
	
	int i=0;
		for(WebElement brand:Brand)
		{
			int a=Brand.indexOf(brand);
			if(i==a)
			{
				for(WebElement product:Product)
				{
					int b=Product.indexOf(product);
					if(i==b)
					{
						for(WebElement price:Price)
						{
							int c=Price.indexOf(price);
							if(i==c)
							{
								System.out.println(i+" > "+brand.getText()+"____"+product.getText()+"____"+price.getText());
								
							}
							
						}						
					}
					
				}
				i++;	
			}
		}
		driver.quit();
	
}

}
