package AutomationTesting;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMultipleBrowser 
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
			 driver.close();
		 	
		//specify type of the browser
		 	String key1= "webdriver.chrome.driver";
		//specify path of drivers .exe file
		String value1 = ".\\drivers\\chromedriver_win32\\chromedriver.exe";
		//specify the path of drivers to server
		 	System.setProperty(key1, value1);
		// Launch empty chrome browser
		 	WebDriver driver1 = new ChromeDriver();
			 driver1.close();
	}
	


}
