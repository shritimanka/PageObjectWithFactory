package com.testcases;

import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.HomePage;
import com.relevantcodes.extentreports.LogStatus;


public class SignInTest extends Page {


	@Test
	public void signInTest() {

		Page.initConfiguration();
		//test.log(LogStatus.INFO, "SignIn Test started");
		HomePage home=new HomePage();
		home.gotoSignIn();
		//test.log(LogStatus.INFO, "SignIn Test ended");
		Page.quitBrowser();	

	}

}
