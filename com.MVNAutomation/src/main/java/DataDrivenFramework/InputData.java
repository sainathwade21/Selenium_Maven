package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public interface InputData {
	
	// Property File
	public String getPropertyValue(String Key) throws IOException;
	public WebDriver launchBrowser(String Key) throws IOException;
	public void launchUrl(String Key) throws IOException;
	public void implicitWait(int Second);
	
	// Excel File
	public String getExcelValue(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException;
	public String getExcelValue(int rowNum, int cellNum) throws EncryptedDocumentException, IOException;
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException;

}
