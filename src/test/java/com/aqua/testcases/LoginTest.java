package com.aqua.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aqua.baseclass.TestBase;
import com.aquasat.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage login;

	public LoginTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		login = new LoginPage();

	}

	@Test
	public void loginPageTest() throws InterruptedException {
		Thread.sleep(6000);
		login.enterEmail(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));
		login.clickLoginButton();
		Thread.sleep(9000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
