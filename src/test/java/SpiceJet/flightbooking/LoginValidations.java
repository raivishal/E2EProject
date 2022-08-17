package SpiceJet.flightbooking;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclasses.InvokeBrowsers;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginValidations extends InvokeBrowsers
{

	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=triggerBrowser();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
		HomePage hpObj=new HomePage(driver);
		hpObj.getLoginButton().click();
	}


	@Test(dataProvider = "listOfUsers")
	public void loginToQaClickAcademy(String userName, String password, String dataValue)
	{		
		LoginPage obj=new LoginPage(driver);
		obj.getUserName().sendKeys(userName);
		obj.getUserPassword().sendKeys(password);
		obj.getSiginButton().click();
		System.out.println(dataValue);
	}

	@DataProvider(name="listOfUsers")
	public Object[][] getData()
	{
		return new Object[][]
				{
			{"qwe@gmail.com","qwe123","1st Data has been validated successfully."},
			{"qwer@gmail.com","qwer1234","2nd Data has been validated successfully."}
				};
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
