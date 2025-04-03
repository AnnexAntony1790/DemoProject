package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	public WebDriver driver;
	
	public ClientPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientName;
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientId;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement search;
	
	
	public ClientPage enterClientnameAndClientId(String Client1,String id)
	{
		clientName.sendKeys(Client1);
		clientId.sendKeys(id);
		return this;
	}
	
	public ClientPage clickOnSearchClient()
	{
		search.click();
		return this;
	}
	
	/*
	 * public boolean isClientPageDisplayed() {
	 * 
	 * return clientsLink.isDisplayed(); }
	 */
	
	
	
	
	

}
