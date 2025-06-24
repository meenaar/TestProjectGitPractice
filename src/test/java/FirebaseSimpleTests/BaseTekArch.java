package FirebaseSimpleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseTekArch extends BaseTest{

	
	public static void loginToTekArch() throws InterruptedException {
		WebElement usernameEle = driver.findElement(By.id("email_field"));
		enterText(usernameEle, "admin123@gmail.com", "username");
	
		WebElement pwdElement = driver.findElement(By.id("password_field"));
		enterText(pwdElement, "admin123", "password");
		
		WebElement loginElement = driver.findElement(By.tagName("button"));
		clickElement(loginElement, "login");
		
		Thread.sleep(5000);
	}
}
