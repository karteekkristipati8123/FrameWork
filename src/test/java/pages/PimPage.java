package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class PimPage extends Base{
	
	public void clickadd() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement addbt = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i"));
		addbt.click();
	}
	
	
}
