package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightObject {
	
	WebDriver driver;
	
	public FlightObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By flightTab=By.xpath("//div[@class='css-1dbjc4n r-1d09ksm r-qklmqi r-1lz4bg0 r-1phboty r-18u37iz']/div[1]");
	By oneWayTripButton=By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[1]");
	
	

}
