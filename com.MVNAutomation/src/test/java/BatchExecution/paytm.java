package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Fetching the page-source and current-url of paytm
//getPageSource()
//getCurrentUrl()

public class paytm {
	@Test
	public void script() {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		
		driver.get("https://www.paytm.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		String source = driver.getPageSource();
		System.out.println(source);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String expectedTitle="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
		String expectedUrl="https://paytm.com/";
	
		if(title.equals(expectedTitle))
		{
			System.out.println("Title is Correct");
		}
		else
		{
			System.out.println("Title is Wrong");
		}
		
		if(url.equals(expectedUrl))
		{
			System.out.println("Url is Correct");
		}
		else
		{
			System.out.println("Url is Wrong");
		}
		driver.quit();
	}

}