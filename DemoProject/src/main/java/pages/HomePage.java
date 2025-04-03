package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement link;
	@FindBy(xpath = "//a[@class='logout-btn']")
	WebElement logoutLink;
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientsLink;

	public HomePage clickOnLink() {
		// explicit wait is used to locate particular element
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(link));
		link.click();
		return this;

	}

	public HomePage clickOnLogout() {
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		logoutLink.click();
		return this;
	}
	public ClientPage clickOnClientsLink()
	{
		clientsLink.click();
		return new ClientPage(driver);
	}

}
