package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ClientPage;
import pages.HomePage;
import pages.LoginPage;

public class ClientPageTest extends Base {
	HomePage homepage;
	ClientPage clientpage;

	@Test
	public void verifyClientSearch() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("carol", "1q2w3e4r");
		homepage = loginPage.clickOnLoginButton();
		clientpage = homepage.clickOnClientsLink();
		clientpage.enterClientnameAndClientId("Diya", "9").clickOnSearchClient();

		// ClientPage clientPage=new ClientPage(driver);
		// clientPage.clickOnClientsLink();
		// clientPage.enterClientnameAndClientId("Diya", "9");
		// clientPage.clickOnSearchClient();

		// String expected="Clients";
		// String actual=driver.getTitle();
		// Assert.assertEquals(expected, actual,"Clients Page is not loaded");

		// boolean isClientPageLoaded = clientPage.isClientPageDisplayed();// Assertion
		// System.out.println("isClientPageLoaded:"+isClientPageLoaded);
		// Assert.assertTrue(isClientPageLoaded,"Client Page is not loaded");

	}
}
