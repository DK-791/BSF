package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.CommonMethods;

public class OrderWizardLocators extends CommonMethods {

	public OrderWizardLocators() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='CostCentre']")
	private WebElement Costcentre;

	@FindBy(xpath = "//select[@id='OrderType']")
	private WebElement OrderType;

	@FindBy(xpath = "//select[@id='WorkType']")
	private WebElement WorkType;

	@FindBy(xpath = "//select[@id='vendorContractList']")
	private WebElement Vendor;
	
	@FindBy(xpath = "//li[@id='continueButton']")
	private WebElement Continue;
	
	@FindBy(xpath = "//input[@id='searchRequestNo']")
	private WebElement Search;
		

	public WebElement getCostcentre() {
		return Costcentre;
	}

	public WebElement getWorkType() {
		return WorkType;
	}

	public WebElement getOrderType() {
		return OrderType;
	}

	public WebElement getVendor() {
		return Vendor;
	}
	
	public WebElement getContinue() {
		return Continue;
	}
	
	public WebElement getSearch() {
		return Search;
	}

}
