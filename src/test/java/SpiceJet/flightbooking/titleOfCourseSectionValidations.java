package SpiceJet.flightbooking;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclasses.InvokeBrowsers;
import pageobjects.HomePage;

public class titleOfCourseSectionValidations extends InvokeBrowsers{
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=triggerBrowser();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test
	public void validateTitleOfCourseSection()
	{
		HomePage hpObj=new HomePage(driver);
		Assert.assertEquals(hpObj.getTitleOfCoureseSection().getText(),"FEATURED COURSES");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

	
	

}
