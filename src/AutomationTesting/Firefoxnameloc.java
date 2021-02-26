//write a script  to click on link by using name locator for Firfox .
package AutomationTesting;
import java.nio.channels.InterruptedByTimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxnameloc 
{
    public static void main(String[] args) throws InterruptedByTimeoutException, InterruptedException
	{
			//specify type of the browser
            String key= "webdriver.gecko.driver";
            //specify path of drivers .exe file
            String value = ".\\drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe";
            //specify the path of drivers to server
                 System.setProperty(key, value);
            // Launch empty Firefox browser
                 FirefoxDriver driver= new FirefoxDriver();
        //Absolute path of html file
        driver.get("file:///C:/Users/Ganesh/eclipse-workspace/Seleniumtest/src/AutomationTesting/Webpages/loc3.html");
        // find the element in the html file with tagname a ,anchor tag
        driver.findElement(By.name("n3"));
        // it consists of address of element which has name as "n3"
        WebElement ele  = driver.findElement(By.name("n3"));
        //wait for 3 seconds
        Thread.sleep(3111);
        //perform click action 
        ele.click();
        // close the driver 
		driver.close();
	}
}


