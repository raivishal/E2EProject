package SpiceJet.flightbooking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import baseclasses.*;
import pageobjects.HomePage;


public class homePageValidations extends InvokeBrowsers{

	HomePage obj;
	WebDriver driver;
	Logger log= LogManager.getLogger(homePageValidations.class.getName());
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=triggerBrowser();
		obj=new HomePage(driver);
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
		log.info("homePageValidations ::: browser has been invoked");
	}

	@Test
	public void clickOnLogin()
	{
		obj.getLoginButton();
		log.info("homePageValidations ::: login button has been clicked");

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		log.info("broser has been closed successfully.");
	}

	





}
