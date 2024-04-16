package KeywordDrivenFramework;

import java.io.IOException;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	/*
	 * @author Sainath Wade
	 */

public class BrowserAction extends GetDataFromFiles {
	
	WebDriver driver;
	String createdUser;
	
	public WebDriver launchBrowser() throws IOException
	{
		String Value = this.getPropertyValue("browser");
		
		if (Value.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (Value.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if (Value.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invali Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
		String url = this.getPropertyValue("url");
		driver.get(url);
		return driver;
	}
	
	public void LoginActiTime() throws IOException, InterruptedException {
		
		String username = this.getPropertyValue("username");
		String password = this.getPropertyValue("password");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();	
		Thread.sleep(2000);
	}
	
	public String random() {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random ram = new Random();
		StringBuffer word = new StringBuffer();

		for(int i=0; i<=5; i++){
			int index = ram.nextInt(alphabet.length());
			char ch = alphabet.charAt(index);
			word.append(ch);
		}
		String name = word.toString();
		return name;
	}
	
	public void createUser_Valid() throws EncryptedDocumentException, IOException {
		
		int row = this.getRowCount();
		int cell = this.getCellCount(row);
		
		for(int i=1; i<=row; i++) {
			int n = 0;
			ArrayList<String> values = new ArrayList<String>();
			for(int j=0; j<cell; j++) {
				String value = this.getExcelValue(i, j);
				values.add(value);
			}
			if (i==1) {
				driver.findElement(By.xpath("//a[@class='content users']")).click();
			}
			driver.findElement(By.xpath("//input[@value='Create New User']")).click();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(values.get(n++));
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(values.get(n++));
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(values.get(n++));
			driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys(values.get(n));
			driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys(values.get(n));
			driver.findElement(By.xpath("//input[@type='submit']")).click();	
		}
	}
	
	public void createUser_Randomly() {
		
		if (driver.getTitle().equals("actiTIME - Enter Time-Track")) {
			driver.findElement(By.xpath("(//td[@class='navItem relative'])[4]")).click();		
		}
		for (int i = 1; i <= randomNum; i++) {
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(this.random());
		String name = this.random();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(this.random());
		String password= this.random();
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}	
	}
	
	public void delete() throws EncryptedDocumentException, IOException {
		
		List<WebElement> users = driver.findElements(By.xpath("//td[@nowrap='1']"));
	
		for (WebElement user : users) {
			String name = user.getText();
		
			if (name.contains("Administrator")) {
				continue;
			}
			else {
				user.click();
				driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
				Alert alt = driver.switchTo().alert();
				alt.accept();
			}
			break;
		}
	}

	public void deleteAllUsers() throws EncryptedDocumentException, IOException {
		
		if (driver.getTitle().equals("actiTIME - Enter Time-Track")) {
			driver.findElement(By.xpath("(//td[@class='navItem relative'])[4]")).click();		
		}
		List<WebElement> users = driver.findElements(By.xpath("//td[@nowrap='1']"));
		int size = users.size();
		for (int i = size; i > 0; i--) {
			this.delete();
		}
	}
	
	public void LogoutAtiTime() {
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}
	
	public void tearDown() {
		driver.quit();
	}
	
}