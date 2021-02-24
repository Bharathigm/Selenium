//Program to Launch Empty Firefox Browser
package AutomationTesting;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowserSel
{
	public static void main(String[] args) throws InterruptedByTimeoutException
	{
		//specify type of the browser
		 	String key= "webdriver.gecko.driver";
		//specify path of drivers .exe file
		 	String value = "C:\\Users\\Ganesh\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		//specify the path of drivers to server
		 	System.setProperty(key, value);
		// Launch empty Firefox browser
		 	FirefoxDriver driver= new FirefoxDriver();
	}
	

}
