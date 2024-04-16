package DataDrivenFramework;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FetchDataFromPropertyOrExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		InputData property = new BaseClass("./src/test/resources/shoppers.properties");
		String url = property.getPropertyValue("URL");
		System.out.println(url);
		
		InputData excel = new BaseClass("./src/test/resources/ShoppersStack.xlsx", "Input");
		
		int count = excel.getRowCount("Input");
		System.out.println(count);
		
		WebDriver driver = property.launchBrowser("BROWSER");
		property.implicitWait(20);
		property.launchUrl("URL");
		
		for (int i = 1; i <= count; i++) {
			
			String username = excel.getExcelValue(i, 0);
			String password = excel.getExcelValue(i, 1);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			//Thread.sleep(2000);
			
			WebElement tostMessage = driver.findElement(By.xpath("//div[contains(text(),'password is wrong')]"));
			if (tostMessage.isDisplayed()) {
				//Thread.sleep(2000);
				continue;
			}
			else {
				break;
			}
			
		}
	}
}
