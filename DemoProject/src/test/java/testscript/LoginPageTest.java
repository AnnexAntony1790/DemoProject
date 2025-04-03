package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends Base {
	HomePage home;

	@Test(dataProvider = "credentials")
	public void verifyUsercanLoginwithValidCredentials(String uname, String pwd) {

		LoginPage loginPage = new LoginPage(driver);// Base class driver
		loginPage.enterUsernameAndPassword(uname, pwd);
		home = loginPage.clickOnLoginButton();

		// String expected = "Login";
		// String actual = driver.getTitle();
		// System.out.println("Title:" + actual);
		// Assert.assertEquals(expected, actual, "DashBoard is not loaded");

		boolean isHomePageisLoaded = loginPage.isDashBoardisDisplayed();// Assertion
		System.out.println("isHomePageisLoaded:" + isHomePageisLoaded);
		Assert.assertTrue(isHomePageisLoaded, "Home Page is not loaded for verifyUsercanLoginwithValidCredentials");

	}

	@Test
	@Parameters({ "username", "password" })
	public void verifyUsercanLoginwithInValidUsernameAndValidPassword(String uname, String pwd) {
		LoginPage loginPage = new LoginPage(driver);// Base class driver
		loginPage.enterUsernameAndPassword(uname, pwd);
		loginPage.clickOnLoginButton();
		boolean isLoginPageisLoaded = loginPage.isLoginpageDisplayed();// Assertion
		System.out.println("isLoginPageisLoaded:" + isLoginPageisLoaded);
		Assert.assertTrue(isLoginPageisLoaded,
				"Login Page is not loaded for verifyUsercanLoginwithInValidUsernameAndValidPassword");
	}

	@Test
	public void verifyUserCanLoginwithValidUsernameAndInvalidpassword() {
		LoginPage loginPage = new LoginPage(driver);// Base class driver
		loginPage.enterUsernameAndPassword("carol", "invalidPassword");
		loginPage.clickOnLoginButton();
		boolean isLoginPageisLoaded = loginPage.isLoginpageDisplayed();// Assertion
		System.out.println("isLoginPageisLoaded:" + isLoginPageisLoaded);
		Assert.assertTrue(isLoginPageisLoaded,
				"Login Page is not loaded for verifyUserCanLoginwithValidUsernameAndInvalidpassword");

	}

	@Test

	public void verifyUSercanLoginwithInvalidUsernameAndInvalidPassword() {
		LoginPage loginPage = new LoginPage(driver);// Base class driver
		loginPage.enterUsernameAndPassword("invalid", "invalid");
		loginPage.clickOnLoginButton();
		boolean isLoginPageisLoaded = loginPage.isLoginpageDisplayed();// Assertion
		System.out.println("isLoginPageisLoaded:" + isLoginPageisLoaded);
		Assert.assertTrue(isLoginPageisLoaded,
				"Login Page is not loaded for verifyUSercanLoginwithInvalidUsernameAndInvalidPassword");
	}

}
