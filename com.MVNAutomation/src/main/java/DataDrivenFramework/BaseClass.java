package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass implements InputData {
	
	WebDriver driver;
	String FilePath;
	String sheetName;
	
	BaseClass(String FilePath)
	{
		this.FilePath=FilePath;
	}
	
	BaseClass(String FilePath, String sheetName)
	{
		this.FilePath=FilePath;
		this.sheetName=sheetName;
	}
	
	public String getPropertyValue(String Key) throws IOException
	{
		// Fetching the particular Property file
		FileInputStream a = new FileInputStream(FilePath);
		Properties properties = new Properties();
		
		// Loading all the values which is present inside the file
		properties.load(a);
		
		// Accessing the particular value by passing key
		String Value = properties.getProperty(Key);
		
		return Value;	
	}
	
	
	public WebDriver launchBrowser(String Key) throws IOException
	{
		String Value = this.getPropertyValue(Key);
		
		if (Value.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (Value.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if (Value.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	
	public void launchUrl(String Key) throws IOException {
		
		String Value = this.getPropertyValue(Key);
		
		driver.get(Value);
	}
	
	
	public void implicitWait(int Second) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Second));
	}
	
	
	public String getExcelValue(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(FilePath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}
	
	public String getExcelValue(int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(FilePath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}
	
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(FilePath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int count = sheet.getLastRowNum();
		return count;
	}

}
