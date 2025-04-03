package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {// Base class driver
		this.driver = driver;
		PageFactory.initElements(driver, this);// for launching page

	}

	@FindBy(xpath = "//input[@id='loginform-username']")
	WebElement userName;
	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement password;
	@FindBy(xpath = "//button[@name='login-button']")
	WebElement loginButton;

	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement dashBoard;
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement link;
	@FindBy(xpath = "//h1[text()='Login']")
	WebElement login;

	public LoginPage enterUsernameAndPassword(String username1, String password1) {
		userName.sendKeys(username1);
		password.sendKeys(password1);
		return this;
	}

	public HomePage clickOnLoginButton() {
		loginButton.click();
		return new HomePage(driver);
	}

	// Assertion method starts with is..
	public boolean isDashBoardisDisplayed() {
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(dashBoard));
		return dashBoard.isDisplayed();
	}

	public boolean isLoginpageDisplayed() {
		return login.isDisplayed();
	}

}
