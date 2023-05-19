package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
		LoginPage loginPage;
		
		
		public LoginPageTest(){
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();	
		}
		
		@Test(priority=1)
		public void loginPageTitleTest(){
			String title = loginPage.validateLoginPageTitle();
			org.testng.Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
		}
				
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	}
	

