package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class x {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		  driver.get("https://www.google.com");

	        // Find the WebElement by its locator
	       // WebElement element = driver.findElement(By.id("element-id"));

	        // Check if the WebElement is present
		  try {
			  if (driver.findElement(By.id("element-id")).isDisplayed()) {
		            System.out.println("WebElement is present on the web page.");
		        } else {
		            System.out.println("WebElement is not present on the web page.");
		        }
			
		} catch (Exception e) {
			System.out.println("arrey");
		}
	       
	}
	

}
