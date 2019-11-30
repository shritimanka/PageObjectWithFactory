package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.AccountSummaryPage;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;


public class LoginTest extends Page {

	@Test
	public void loginTest(){
				
		Page.initConfiguration();
		//test.log(LogStatus.INFO, "Login Test started");
		HomePage home = new HomePage();
		home.gotoSignIn();
		LoginPage login=new LoginPage();
		login.doLogin("username", "password");
		String actual = Page.driver.getTitle();
		System.out.println("welcome to git");
		String expected="Zero - Account Summary";
		Assert.assertEquals(actual, expected);
		//test.log(LogStatus.INFO, "Login Test started");
		Page.quitBrowser();
		}

}
