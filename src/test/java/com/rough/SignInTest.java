package com.rough;

import com.base.Page;
import com.pages.actions.HomePage;


public class SignInTest {

	public static void main(String[] args) {
		
		
		Page.initConfiguration();
		HomePage home=new HomePage();
		home.gotoSignIn();
		Page.quitBrowser();
		

	}

}
