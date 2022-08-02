package com.runner.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Cucumber.BaseClass;
import com.configuration.com.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Cucumber\\Feature\\login.feature",

		glue = "com.stepdefenition.com",

		plugin = { "pretty", "html:report" })

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUP() throws Exception {
		System.out.println("Chrome is opening ");

		String browser = FileReaderManager.getInstanceFR().getInstance_CR().getBrowser();
		driver = BaseClass.browserLaunch(browser);
	}

	@AfterClass
	public static void close() {
		driver.close();
	}

}
