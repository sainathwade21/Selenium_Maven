package PomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class validLogin {

public static void main(String[] args) throws IOException {
	
	BrowserAction browser = new BrowserAction();
	WebDriver driver=browser.launchBrowser();
	
	LoginPage login = new LoginPage(driver);
	login.ValidLogin();
	
	}
}
