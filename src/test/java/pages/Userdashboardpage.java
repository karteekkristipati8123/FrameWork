package pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Userdashboardpage extends Base{
	

	WebElement adduserbutton = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
	
	public void adduser() throws InterruptedException
	{
		Thread.sleep(6000);

		adduserbutton.click();
		
	}
		
		
	}
	
	

