package PomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class A {
	public static void main(String[] args) throws IOException, InterruptedException {

		BrowserAction browser = new BrowserAction();
		WebDriver driver=browser.launchBrowser();
		
		LoginPage login = new LoginPage(driver);
		login.ValidLogin();
		
		HomePage home = new HomePage(driver);
//		home.getViewTimeTrack().click();
		Thread.sleep(2000);
		home.getLogout().click();
	}	
	
}
