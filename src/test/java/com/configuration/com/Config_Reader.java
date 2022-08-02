package com.configuration.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {   //page 2
	public static Properties p;

	// when we invoke any method, it will invoke the in constructor
	public Config_Reader() throws Exception { // constructor
		File f = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\new\\Cucumber\\src\\test\\java\\com\\configuration\\com\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("Url");
		return url;
	}

	public String getUserName() {
		String username = p.getProperty("username");
		return username;
	}

}
