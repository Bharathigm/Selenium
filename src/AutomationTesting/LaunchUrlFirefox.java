package AutomationTesting;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchUrlFirefox
{
	public static void main(String[] args) throws InterruptedByTimeoutException
	{
		//specify type of the browser
		 	String key= "webdriver.gecko.driver";
		//specify path of drivers .exe file
		String value = ".\\drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe";
		//specify the path of drivers to server
		 	System.setProperty(key, value);
		// Launch empty Firefox browser
		 	FirefoxDriver driver= new FirefoxDriver();
			 String baseUrl = "http://www.facebook.com";
			 driver.get(baseUrl);
			 driver.close();
	}
	

}
