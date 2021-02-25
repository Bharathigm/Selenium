package AutomationTesting;
import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchUrltitleFirefox {
    public static void main(String[] args) throws InterruptedByTimeoutException
	{
		//specify type of the browser
		 	String key= "webdriver.gecko.driver";
		//specify path of drivers .exe file
		 	String value = "C:\\Users\\Ganesh\\eclipse-workspace\\Seleniumtest\\drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe";
		//specify the path of drivers to server
		 	System.setProperty(key, value);
		// Launch empty Firefox browser
		 	FirefoxDriver driver= new FirefoxDriver();
             genericBrowser(driver,"http://www.facebook.com");
             driver.close();
			 
	}
    public static void genericBrowser(WebDriver driver, String Url)
    {
        driver.get(Url);
        String title = driver.getTitle();
        System.out.println(title);
        String urlstring = driver.getCurrentUrl();
        System.out.println(urlstring);
        String src_code = driver.getPageSource();
        System.out.println(src_code);

    }
}
