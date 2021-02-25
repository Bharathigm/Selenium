package AutomationTesting;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSrccodewebbrowser 
{	
    public static void main(String[] args) throws InterruptedByTimeoutException
	{
		//specify type of the browser
		 	String key= "webdriver.chrome.driver";
		//specify path of drivers .exe file
		 	String value = "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//specify the path of drivers to server
		 	System.setProperty(key, value);
		// Launch empty chrome browser
		 	WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			String title=driver.getTitle();
			System.out.print(title);
			String URL = driver.getCurrentUrl();
			System.out.print(URL);
			String Sourcecode = driver.getPageSource();
			System.out.print(Sourcecode);
            System.out.print("Success");
	}
}