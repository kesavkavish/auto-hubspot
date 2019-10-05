package com.orangehrm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test(priority=2)
	public void orgHrmLoginPageTitleTest() {
		test = reports.createTest("orgHrmLoginPageTitleTest");
		new LoginPage().verifyLoginPageDisplayed();
		String loginPageTitle = new LoginPage().verifyLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "HubSpot Login", "HubSpot login page title is missing");
	}
	
	@Test(priority=3)
	public void orgHrmLoginTest() throws Exception {
		test = reports.createTest("orgHrmLoginTest");
		new LoginPage().verifyOrgHrmLogin(prop.getProperty("admin_user"), prop.getProperty("admin_password"));
	}
}
