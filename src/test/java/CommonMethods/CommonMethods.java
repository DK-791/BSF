package CommonMethods;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	public static WebDriver driver;
	//Browser Launch
	public void browserLaunch() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	//Browser Quit
	public void browserClose() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	//Get URL
	public void getUrl(String Url) {
		driver.get(Url);
	}
	//Clear
	public void clear(WebElement W) {
		W.clear();
	}
	//Thread.Sleep
	public void waits() throws Exception {
		Thread.sleep(3000);
	}
	//SendKeys
	public void sendkeys(WebElement W, String S) {
		W.sendKeys(S);
	}
	//Click
	public void click(WebElement W) {
		W.click();
	}
	//Select by Value
	public void selectbyValue(WebElement W ,String S) {
		Select s= new Select (W);
		s.selectByValue(S);
	}
	//Select by Index
	public void selectbyIndex(WebElement W ,int S) {
		Select s= new Select (W);
		s.selectByIndex(S);
	}
	//Select By Visible Text
	public void selectbyVisibleText(WebElement W ,String S) {
		Select s= new Select (W);
		s.selectByVisibleText(S);
	}
	// Java script Click 
	public void javaexeClick(WebElement W){
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", W);
	}
	//Java script Scroll Down
	public void javaexeScrollDown(WebElement W) throws Exception{
		JavascriptExecutor J=(JavascriptExecutor) driver;
		Thread.sleep(1000);
		J.executeScript("arguments[0].scrollIntoView(true)",W );
	}
	//Double Click
	public void doubleClick(WebElement W){
		Actions A= new Actions(driver);
		A.doubleClick(W).perform();
	}
	//Key Press Space
	public void keyPressSpace() throws Exception{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SPACE);
	}
	//Key Release Space
	public void keyReleaseSpace() throws Exception{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_SPACE);
	}
	//Alert Accept
	public void alertAccept(){
		Alert A= driver.switchTo().alert();
		A.accept();
	}

}
