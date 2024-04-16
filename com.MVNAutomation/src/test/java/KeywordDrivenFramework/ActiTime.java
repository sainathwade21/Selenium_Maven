package KeywordDrivenFramework;

import java.io.IOException;

public class ActiTime {
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		BrowserAction window = new BrowserAction();
		
		window.launchBrowser();
		window.LoginActiTime();
//		window.createUser_Valid();
		window.createUser_Randomly();
		Thread.sleep(3000);
		window.deleteAllUsers();
//		window.LogoutAtiTime();
	}

}
