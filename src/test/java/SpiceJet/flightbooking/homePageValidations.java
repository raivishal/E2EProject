package SpiceJet.flightbooking;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import baseclasses.*;
import pageobjects.HomePage;


public class homePageValidations extends InvokeBrowsers{

	HomePage obj;

	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=triggerBrowser();
		obj=new HomePage(driver);
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
	}

	@Test
	public void clickOnLogin()
	{
		obj.getLoginButton().click();

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

	





}
