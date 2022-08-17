package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By userName=By.id("user_email");
	By password=By.id("user_password");
	By loginButton=By.cssSelector("input[value='Log In']");
	
	
	public WebElement getUserName()
	{
		return driver.findElement(userName);
	}
	
	public WebElement getUserPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSiginButton()
	{
		return driver.findElement(loginButton);
	}

}
