package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class EditUser extends Base{
	
//WebElement editbutton = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]"));
WebElement editbt = new WebDriverWait(driver, Duration.ofSeconds(10))
.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]")));
public void useredit() throws InterruptedException
{
	editbt.click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
//	Thread.sleep(2000);
//	Alert calert =driver.switchTo().alert();
//	System.out.println(calert.getText());
//	Thread.sleep(2000);
//	calert.accept();
}

}
