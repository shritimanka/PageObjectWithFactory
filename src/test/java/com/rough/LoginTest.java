package com.rough;

import org.testng.Assert;

import com.base.Page;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;


public class LoginTest {

	public static void main(String[] args) {
		
		
		Page.initConfiguration();
		HomePage home = new HomePage();
		home.gotoSignIn();
		LoginPage login=new LoginPage();
		login.doLogin("username", "password1");
		String actual = Page.driver.getTitle();
		String expected="Zero - Account Summary";
		Assert.assertEquals(actual, expected);
		Page.quitBrowser();
		

	}

}
