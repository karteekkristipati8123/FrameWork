package tests;

import org.testng.annotations.Test;

import base.Base;
import pages.AddEmployee;
import pages.Adduser;
import pages.BuzzPage;
import pages.EditUser;
import pages.Homepage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.PimPage;
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
//
		Homepage hp = new Homepage();
		Thread.sleep(4000);
//		hp.clickpim();
//		hp.clickadmin();
//		Thread.sleep(4000);
//		
//		Userdashboardpage ud = new Userdashboardpage();
//		Thread.sleep(4000);
//		ud.adduser();
//		Thread.sleep(4000);
	
//		Adduser ad= new Adduser();
//		Thread.sleep(4000);
//		ad.user();
//		Thread.sleep(4000);
	
//		EditUser ed = new EditUser();
//		Thread.sleep(6000);
//		ed.useredit();
//		Thread.sleep(6000);

//		PimPage pg= new PimPage();
//		Thread.sleep(4000);
//		pg.clickadd();
//		Thread.sleep(4000);
//		
//		AddEmployee ae = new AddEmployee();
//		ae.addemployee();
//
		BuzzPage bg = new BuzzPage();
		bg.post();
		
		
		LogoutPage lop = new LogoutPage();
		lop.clickLogout();

	}
//
}
