package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class PimPage extends Base{
	WebElement addbt = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"));
	public void clickadd()
	{
		addbt.click();
	}
	
	
}
