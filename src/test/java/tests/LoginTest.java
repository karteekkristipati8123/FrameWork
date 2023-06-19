package tests;

import org.testng.annotations.Test;

import base.Base;
import pages.Homepage;
import pages.LoginPage;
import pages.Userdashboardpage;

public class LoginTest extends Base {
	@Test
	public static void test1() throws InterruptedException {
		setup();

		LoginPage lp = new LoginPage();
		lp.enterEmail(prop.getProperty("username"));

		lp.enterpassword(prop.getProperty("password"));

		lp.loginbutton();
		Thread.sleep(5000);

		Homepage hp = new Homepage();
//		String actualPageHeaderText = hp.getpageHeader();
//		Assert.assertEquals(actualPageHeaderText, "Dashboard", "Dashboard page title page not match");
		Thread.sleep(6000);
		hp.clickadmin();
		Userdashboardpage ud = new Userdashboardpage();
		Thread.sleep(6000);
		ud.adduser();

//		Thread.sleep(6000);
//		hp.clickProfileIcon();
//		Thread.sleep(5000);
//		LogoutPage lop = new LogoutPage();
//		lop.clickLogout();

	}

}
