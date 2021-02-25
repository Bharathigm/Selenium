package scrapeing;

import java.nio.channels.InterruptedByTimeoutException;
import org.openqa.selenium.firefox.*;
public class seleniumscript
{
	public static void main(String[] args) throws InterruptedByTimeoutException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ganesh\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.close();
		
	}
	

}
