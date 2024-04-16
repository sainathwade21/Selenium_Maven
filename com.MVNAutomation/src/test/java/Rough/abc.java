package Rough;

import java.io.IOException;

public class abc {
	
public static void main(String[] args) throws IOException {
	
	Baseclass b1 = new Baseclass("./src/test/resources/CommonData.properties");
	Baseclass b2 = new Baseclass("./src/test/resources/ActiTime.properties");

	String url = b1.property("url");
	System.out.println(url);
	
	String user = b2.property("USERNAME");
	System.out.println(user);
}	
}
