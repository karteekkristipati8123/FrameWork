package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class LogoutPage extends Base{
	

	WebElement logout_ele = driver.findElement(By.xpath("//div//ul[@class='oxd-dropdown-menu']//li[4]//a"));
	
	public void clickLogout()
	{
		Duration timeout = null;
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(logout_ele));
		logout_ele.click();
	}

}
