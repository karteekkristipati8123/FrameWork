package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class LoginPage  extends Base{
	//for user name
		WebElement emailId = driver.findElement(By.name("username"));
		
		//for password
		WebElement password =driver.findElement(By.name("password"));
		
		//for login button
		WebElement loginbt = driver.findElement(By.xpath("//button"));
		
		public void enterEmail(String n) {
			emailId.sendKeys(n);
		}
		
		 public void enterpassword(String p)
		 {
			 password.sendKeys(p);
		 }
		 
		 public void loginbutton()
		 {
			 loginbt.click();
		 }
}
