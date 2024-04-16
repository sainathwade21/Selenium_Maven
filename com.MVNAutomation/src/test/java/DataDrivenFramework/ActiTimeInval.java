package DataDrivenFramework;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeInval {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		InputData property = new BaseClass("./src/test/resources/ActiTime.properties");
		String url = property.getPropertyValue("URL");
		System.out.println(url);
		
		InputData excel = new BaseClass("./src/test/resources/ActiTime.xlsx", "Sheet1");
		
		int count = excel.getRowCount("Sheet1");
		System.out.println(count);
		
		WebDriver driver = property.launchBrowser("BROWSER");
		property.implicitWait(20);
		property.launchUrl("URL");
		
		for (int i = 1; i <= count; i++) {
			
			String username = excel.getExcelValue(i, 0);
			String password = excel.getExcelValue(i, 1);
			Thread.sleep(2000);
			WebElement id = driver.findElement(By.xpath("//input[@name='username']"));
			id.clear();
			id.sendKeys(username);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			
			
//			WebElement error = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
//			if (error.equals()) {
//				
//			}
			
		}
	}


}
