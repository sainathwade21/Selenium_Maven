package Rough;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

import KeywordDrivenFramework.BrowserAction;

public class ss {

	public static void main(String[] args) throws InterruptedException {
	
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("http://127.0.0.1/login.jsp");
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
			
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			WebElement users = driver.findElement(By.xpath("(//td[@class='navItem relative'])[4]"));
//			if (users.isEnabled()) {
//				System.out.println("yes");
//			}
//			if (users.isDisplayed()) {
//				System.out.println("yes");
//			}
//			if (users.isSelected()) {
//				System.out.println("yes");
//			}
			driver.findElement(By.xpath("(//td[@class='navItem relative'])[4]")).click();
			Thread.sleep(3000);
			WebElement user= driver.findElement(By.xpath("(//td[@class='navItem relative'])[4]"));

			if (user.isSelected()) {
				System.out.println("yes");
			}

			if (users.isEnabled()) {
				System.out.println("yes");
			}
			WebElement createuser = driver.findElement(By.xpath("//input[@value='Create New User']"));
			System.out.println(createuser.getText());
			createuser.click();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test Engg");
			
			driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("kat");
		
			driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("kat");
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Katherine");
			
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Langford");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			

			String createdUser = "Katherine";
			//driver.findElement(By.xpath("//a[@class='content users']")).click();
			List<WebElement> Users = driver.findElements(By.xpath("//td[@nowrap='1']"));
			
//			for (WebElement user : Users) {
//				String name = user.getText();
//				System.out.println(name);
//				if (name.contains(createdUser)) {
//					user.click();
//					driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
//					Alert alt = driver.switchTo().alert();
//					alt.accept();
//				}
//			}
			
		
	}

}
