package pages;

import org.openqa.selenium.By;

import base.Base;

public class AddEmployee extends Base {

	public void addemployee()
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Krishna");  
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Kanth"); 
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	}
}
