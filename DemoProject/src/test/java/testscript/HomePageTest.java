package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
	HomePage home;

	@Test
	public void verifyUserCanLogout() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("carol", "1q2w3e4r");
		home = loginPage.clickOnLoginButton();
		home.clickOnLink().clickOnLogout();
		// HomePage homePage=new HomePage(driver);//Base class driver
		// homePage.clickOnLink();
		// homePage.clickOnLogout();

		String expected = "Login";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual, "Home Page is not loaded");

	}
}
