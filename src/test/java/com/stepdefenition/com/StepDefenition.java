package com.stepdefenition.com;

import org.openqa.selenium.WebDriver;

import com.Cucumber.BaseClass;
import com.configuration.com.FileReaderManager;
import com.pom.com.POM;
import com.runner.com.Runner;

import io.cucumber.java.en.*;

public class StepDefenition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	POM pom = new POM(driver);

	@Given("launch page")
	public void launch_page() throws Exception {
		String url = FileReaderManager.getInstanceFR().getInstance_CR().getUrl();
		getUrl(url);
	}

	@When("user enter the user name")
	public void user_enter_the_user_name() throws Exception {
		String userName = FileReaderManager.getInstanceFR().getInstance_CR().getUserName();
		sendKeys(userName, pom.getUsername());
	}

	@When("User enter password")
	public void user_enter_password() {
		sendKeys("J255GQ", pom.getPassword());
	}

	@Then("user click the login button")
	public void user_click_the_login_button() {
		click(pom.getLogin());
	}
}
