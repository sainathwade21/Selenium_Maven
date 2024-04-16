package Rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Baseclass {
	
	String filePathString;
	
	Baseclass(String path)
	{
		this.filePathString=path;
	}
	
	public String property(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(filePathString);
		Properties properties = new Properties();
		properties.load(fis);
		
		String value = properties.getProperty(key);
		
		return value;
	}

}
