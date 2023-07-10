package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class Adduser extends Base {

	public void user() throws InterruptedException {
		driver.findElement(By.xpath("//label[contains( text(), 'User Role')]/../following-sibling::div//i")).click();

		List<WebElement> li = driver.findElements(By.xpath("//div[@role='listbox']/div"));

		System.out.println(li.size());

		for (WebElement el : li) {
			String val = el.getText();
	

			if (val.equalsIgnoreCase("ESS")) {
				el.click();
				Thread.sleep(3000);
//				break;
			}
		}

		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper']//div//input")).sendKeys("ravi");

		driver.findElement(By.xpath("//label[contains( text(), 'Status')]/../following-sibling::div//i")).click();

		List<WebElement> li2 = driver.findElements(By.xpath("//div[@role='listbox']/div"));

		System.out.println(li.size());

		for (WebElement el2 : li2) {
			String val2= el2.getText();
			

			if (val2.equalsIgnoreCase("Enabled")) {
				el2.click();
				Thread.sleep(3000);
//				break;
			}
		}
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Ravi Kumar Reddy");
	
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Ravi123");
	
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Ravi123");
		
		driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[@type='submit']")).click();
	}
	
}
