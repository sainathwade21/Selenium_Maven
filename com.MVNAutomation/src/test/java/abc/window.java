package abc;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://www.amazon.in/ref=nav_logo");
	 
	 // Search URL in new Tab
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.facebook.com/");
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.zomato.com/");
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.flipkart.com/");
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.linkedin.com/");
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.swiggy.com/");
}
	

}
