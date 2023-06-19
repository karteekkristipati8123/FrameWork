package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class Adduser extends Base{

//	WebElement  userRole = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div"));
	public void user()
	{
		
//		userRole.click();
		WebElement userRole =driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
		userRole.click();
		Select dd = new Select(userRole);
		dd.selectByIndex(2);
	}
}

