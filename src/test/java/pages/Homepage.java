package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Homepage extends Base{
	WebElement admintab = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']//li[1]//span")));
	WebElement pimtab = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']//li[2]//span")));
//	WebElement livtab = new WebDriverWait(driver, Duration.ofSeconds(10))
//	        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']//li[3]//span")));
	WebElement buzztab = new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']//li[12]//span")));
	
	
	
//	public void clickadmin()
//	{
//		admintab.click();
//		
//	}
	
	public void clickpim()
	{
	pimtab.click();
	}
//
//	public void leavetab()
//	{
//		livtab.click();
//	}
                 
      public void clickbuzz() {
    	  buzztab.click();
      }
             
//	}

}

//public String getpageHeader() {
//
//	String pageHeaderText = headerText.getText();
//	return pageHeaderText;
//
//}
