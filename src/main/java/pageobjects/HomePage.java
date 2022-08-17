package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By loginButton=By.linkText("Login");//a[href*='sign_in'] | //a[contains(@href,'sign_in')]
	By navigationBar=By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	By titleOfCoureseSection=By.xpath("//div[@class='text-center']/h2");
	
	
	
	public WebElement getLoginButton()
	{
		return driver.findElement(loginButton);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(navigationBar);
	}
	
	public WebElement getTitleOfCoureseSection()
	{
		return driver.findElement(titleOfCoureseSection);
	}
	
	
	

}
