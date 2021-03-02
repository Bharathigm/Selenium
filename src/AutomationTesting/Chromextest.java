package AutomationTesting;

import java.nio.channels.InterruptedByTimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromextest
{
     
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
			 String baseUrl = "http://www.google.com";
			 driver.get(baseUrl);
             driver.get(baseUrl);
        WebElement ele  = driver.findElement(By.name("q"));
        ele.sendKeys("admin");
        driver.findElement(By.xpath("//div[.='btnK']")).click();       
        String title = driver.getTitle();
        System.out.println(title);
        // close the driver 
			// driver.close();
	}

    
}
