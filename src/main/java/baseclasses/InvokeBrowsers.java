package baseclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeBrowsers {
	
	public WebDriver driver;
	
	public WebDriver triggerBrowser() throws IOException
	{
		String chromeExePath="D:\\ExternalLibrary\\chromedriver_win32\\chromedriver.exe";
		
		
		Properties prop=new Properties();
		FileInputStream propertyFile=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//data.properties");
		prop.load(propertyFile);
		String browser=prop.getProperty("browser");
		
		//trigger specific browser as per the data provided in properties file for "browser" property.
		switch(browser)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			driver=new ChromeDriver();
			break;
		case "firefox":
			break;
		case "ie":
			break;
		default:
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	

}
