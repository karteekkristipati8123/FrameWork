package pages;

import org.openqa.selenium.By;

import base.Base;

public class BuzzPage extends Base{

	public void post() {
		driver.findElement(By.xpath("//div[@class='oxd-buzz-post-slot']/button")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div/form/div[1]/div[2]/div/textarea")).sendKeys(" Happy Birthday");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div/div/i")).click();
		
	}
}
