package FirebaseSimpleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver = null;
	public static void launchBrowser (String browserName) {		
	
		switch (browserName.toLowerCase()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default: 
			break;
		}
	}
	
	public static void gotoUrl(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
	}
	
	public static void closeDriver() {
		driver.close();
	}
	
	public static void enterText (WebElement ele, String data, String objectName) {
		
		if (ele.isDisplayed()) {			
			ele.clear();
			ele.sendKeys(data);
			System.out.println("data is entered in the "+objectName);
		}
		else{
			System.out.println(objectName+" textbox is not diplayed");
		}		
	}
	
	public static void clickElement (WebElement ele, String objectName) {
		if (ele.isEnabled()) {			
		
			ele.click();
			System.out.println(objectName + " is clicked");
		}
		else{
			System.out.println(objectName+" is not clicked");
		}
		
	}
	public static void selectElement(WebElement ele,String objectName) {
		if(!ele.isSelected()) {
			ele.click();
			System.out.println(objectName+" is selected");
		}
		else{
			System.out.println(objectName+" is already selected");
		}
	}
	public static void selectByValue (WebElement ele, String value) {
	
		Select select = new Select(ele);
		select.selectByValue(value);		
	}
	
	public static void selectByVisibleText (WebElement ele, String value) {
		
		Select select = new Select(ele);
		select.selectByVisibleText(value);		
	}
	
	public static void waitForVisibility(WebElement ele, long timeInSec, String ObjectName) {
		
		System.out.println("Waiting for visibility of "+ ObjectName+" for maximum of "+ timeInSec+ "sec");
		
		WebDriverWait wait = new WebDriverWait(driver, timeInSec);
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static void waitForAlertToPresent(long timeInSec, String ObjectName) {
		
		System.out.println("Waiting for visibility of "+ ObjectName+" for maximum of "+ timeInSec+ "sec");
		
		WebDriverWait wait = new WebDriverWait(driver, timeInSec);
		
		wait.until(ExpectedConditions.alertIsPresent());		
	}
	
	public static void waitForElementToBeClickable(WebElement ele, long timeInSec, String ObjectName) {
		
		System.out.println("Waiting for "+ ObjectName+" to be clickable for maximum of "+ timeInSec+ "sec");
		
		WebDriverWait wait = new WebDriverWait(driver, timeInSec);
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));		
	}
	
	public static void waitForViTextToBePresentInElement(WebElement ele, long timeInSec, String text, String ObjectName) {
		
		System.out.println("Waiting for visibility of "+ ObjectName+" for maximum of "+ timeInSec+ "sec");
		
		WebDriverWait wait = new WebDriverWait(driver, timeInSec);
		
		wait.until(ExpectedConditions.textToBePresentInElement(ele, text));		
	}
	
}
