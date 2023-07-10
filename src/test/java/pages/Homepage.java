package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Homepage extends Base{
//	WebElement admintab = new WebDriverWait(driver, Duration.ofSeconds(10))
//        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']//li[1]//span")));
//	WebElement pimtab = new WebDriverWait(driver, Duration.ofSeconds(10))
//	        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']//li[2]//span")));
	WebElement livtab = new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']//li[3]//span")));
	
	
	
//	public void clickadmin()
//	{
//		admintab.click();
//	}
	
//	public void clickpim()
//	{
//		pimtab.click();
//	}

	public void leavetab()
	{
		livtab.click();
	}
                 
      
             
//	}

}
//WebElement profileicon = driver.findElement(By.xpath("//li[@class='--active oxd-userdropdown']//span//p"));
//
//WebElement headerText = driver.findElement(By.xpath("//div[@class='oxd-topbar-header']//span/h6"));

//public void clickProfileIcon() {
//	Duration timeout = null;
//	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(profileicon));
//	profileicon.click();
//}

//public String getpageHeader() {
//
//	String pageHeaderText = headerText.getText();
//	return pageHeaderText;
//
//}
