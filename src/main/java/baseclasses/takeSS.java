package baseclasses;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeSS {
	
	
	public void capruteSS(String testCaseName, WebDriver driver) throws IOException
	{
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source= ss.getScreenshotAs(OutputType.FILE);
		String placeSSAt=System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
		FileUtils.copyFile(source, new File(placeSSAt));
	}

}
