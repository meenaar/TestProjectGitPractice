package FirebaseSimpleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC3EnterStudentFormDetails extends BaseTekArch{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		launchBrowser("chrome");
		
		gotoUrl("https://qa-tekarch.firebaseapp.com/");
		
		loginToTekArch();
		
		//Thread.sleep(5000);
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
		waitForVisibility(name,30,"Name Text box");
		
		name.sendKeys("test");
		enterText(name, "Meera", "name");
		
		WebElement lname = driver.findElement(By.id("lname"));
		enterText(lname, "Kannan", "father name");
		
		WebElement postalAddress = driver.findElement(By.id("postaladdress"));
		enterText(postalAddress, "13 charri street", "postal address");
		
		WebElement personalAddress = driver.findElement(By.id("personaladdress"));
		enterText(personalAddress, "west masi street", "personal address");
		
		
		WebElement femaleRadio = driver.findElement(By.xpath("//input[@value='female']"));
		selectElement(femaleRadio, "female radio ");
		
		WebElement maleRadio= driver.findElement(By.xpath("//input[@value='male']"));
		if(!maleRadio.isSelected()) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
		
		WebElement picCode = driver.findElement(By.id("pincode"));
		enterText(picCode, "630302", "pincode");
		
		WebElement emailID = driver.findElement(By.id("emailid"));
	
		
		waitForVisibility(emailID,30,"Email Text box");
		
		enterText(emailID, "aa123@gmail.com", "email");
	//	Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.className("bootbutton"));
		
		waitForElementToBeClickable(submit, 30, "submit");
		
		clickElement(submit, "submit");
		

	//	Thread.sleep(5000);
		
		driver.close();
		
	}

}
