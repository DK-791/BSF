package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.CommonMethods;

public class WorkOrderLocators  extends CommonMethods{
	
	
	public WorkOrderLocators() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='SACName']")
	private WebElement CommonSAC;

	@FindBy(xpath = "(//div[@class='jqx-checkbox-default jqx-fill-state-normal jqx-rc-all'])[2]")
	private WebElement SACCodeCheckbox;
	
	@FindBy(xpath = "(//button[@class='md_ok'])[6]")
	private WebElement SACCodeOkbutton;
	
	
	@FindBy(xpath = "//input[@id='desc_1']")
	private WebElement Description;

	@FindBy(xpath = "(//div[@class='jqx-checkbox-default jqx-fill-state-normal jqx-rc-all'])[2]")
	private WebElement ItemCheckbox;
	
	@FindBy(xpath = "(//button[@class='md_ok'])[1]")
	private WebElement ItemOkbutton;
	
	@FindBy(xpath = "//input[@id='qty_1']")
	private WebElement Qty;
	
	@FindBy(xpath = "//input[@id='rate_1']")
	private WebElement Rate;
	
	@FindBy(xpath = "//input[@id='amount_1']")
	private WebElement Amount;
	
	@FindBy(xpath = "//label[text()='Ready for Approval']")
	private WebElement ReadyforApproval;
	
	@FindBy(xpath = "//li[@id='submit-btn']")
	private WebElement Submit;
	
	

	public WebElement getCommonSAC() {
		return CommonSAC;
	}

	public WebElement getSACCodeCheckbox() {
		return SACCodeCheckbox;
	}

	public WebElement getSACCodeOkbutton() {
		return SACCodeOkbutton;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getItemCheckbox() {
		return ItemCheckbox;
	}

	public WebElement getItemOkbutton() {
		return ItemOkbutton;
	}

	public WebElement getQty() {
		return Qty;
	}

	public WebElement getRate() {
		return Rate;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getAmount() {
		return Amount;
	}

	public WebElement getReadyforApproval() {
		return ReadyforApproval;
	}
	
	
	

}
