package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import base.Base;

public class LogoutPage extends Base{
	
	

	
	public void clickLogout() throws InterruptedException
	{
		Thread.sleep(7000);
		WebElement log = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']/ul/li//img"));

		log.click();
		Thread.sleep(7000);
		WebElement logout_ele = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li/a[contains(text(),'Logout')]"));
		
		logout_ele.click();
	}

}
