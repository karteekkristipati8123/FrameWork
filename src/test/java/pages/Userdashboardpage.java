package pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Userdashboardpage extends Base{
	

	WebElement adduserbutton = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i"));
	
	public void adduser() throws InterruptedException
	{
		Thread.sleep(6000);

		adduserbutton.click();
		
	}
		
		
	}
	
	

