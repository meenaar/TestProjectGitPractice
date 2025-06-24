package FirebaseSimpleTests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class TC1TekarchLoginValidateTitle extends BaseTekArch{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		launchBrowser("chrome");
	
		gotoUrl("https://qa-tekarch.firebaseapp.com/");		
		
		loginToTekArch();
		
		WebElement title = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/h1"));
		
		
		waitForVisibility(title,30,"Header Title");
		
	//	Thread.sleep(5000);
		
		System.out.println("Header title after login is : "+title.getText());
		
		if (title.getText().equals("Student Registration Form"))
			System.out.println("Student Registration Form is validated and shows correctly");
		else
			System.out.println("It doesn't show title as Student Registration Form");
		
		driver.close();

	}

}
