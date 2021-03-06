
package AutomationTesting;
import java.nio.channels.InterruptedByTimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchUrlTitleChrome {
    public static void main(String[] args) throws InterruptedByTimeoutException
	{
		//specify type of the browser
        String key= "webdriver.chrome.driver";
		//specify path of drivers .exe file
        String value = ".\\drivers\\chromedriver_win32\\chromedriver.exe";
		//specify the path of drivers to server
		 	System.setProperty(key, value);
		// Launch empty chrome browser
		 	WebDriver driver = new ChromeDriver();
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
