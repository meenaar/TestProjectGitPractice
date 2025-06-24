package FirebaseSimpleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC2TekarchLoginInvalidPwd extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		launchBrowser("chrome");
		
		gotoUrl("https://qa-tekarch.firebaseapp.com/");
		
		WebElement usernameEle = driver.findElement(By.id("email_field"));
		enterText(usernameEle, "admin123@gmail.com", "username");
	
		WebElement pwdElement = driver.findElement(By.id("password_field"));
		enterText(pwdElement, "12345", "password");
		
		WebElement loginElement = driver.findElement(By.tagName("button"));
		clickElement(loginElement, "login");
		
		
		
		/*
		 * 
		WebElement alertEle = driver.findElement(By.id("alertbtn"));
		clickElement(alertEle,"alert Button");
		Alert alert= driver.switchTo().alert();
		String data=alert.getText();
		alert.accept();
		System.out.println(data);
		 * 
		 * 
		 * */
		
		
	//	driver.close();
	}

}
