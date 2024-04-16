package DataDrivenFramework;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewUrlinNewTab {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		InputData excel = new BaseClass("./src/test/resources/Url.xlsx", "Sheet1");
		int count = excel.getRowCount("Sheet1");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		InputData property = new BaseClass("./src/test/resources/CommonData.properties");
		String url = property.getPropertyValue("url");
		driver.get(url);
				
		for (int i = 1; i <count; i++) {
			
			driver.switchTo().newWindow(WindowType.TAB);
			String Url = excel.getExcelValue(i, 0);
			driver.get(Url);
			
	}
	}
}

