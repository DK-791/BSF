package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.CommonMethods;

public class LoginLocators extends CommonMethods{
	
	public LoginLocators(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;

	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='keepme_login']")
	private WebElement keepme;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@class='forgetpwd_p']")
	private WebElement forgetpass;

	public WebElement getUsername() {
		return username;
	}

	
	public WebElement getPassword() {
		return password;
	}


	public WebElement getKeepme() {
		return keepme;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public WebElement getForgetpass() {
		return forgetpass;
	}


}
