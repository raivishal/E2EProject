package SpiceJet.flightbooking;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclasses.InvokeBrowsers;
import pageobjects.HomePage;

public class navigationBarValidation extends InvokeBrowsers
{
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=triggerBrowser();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test
	public void validateNavigationBar()
	{
		HomePage hpObj=new HomePage(driver);
		Assert.assertTrue(hpObj.getNavigationBar().isDisplayed());
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}


}
