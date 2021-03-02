package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firfoxlinktext 
{
    public static void main(String[] args) throws InterruptedException
  {
    	//specify type of the browser
        String key= "webdriver.gecko.driver";
        //specify path of drivers .exe file
        String value = ".\\drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe";
		//specify the path of drivers to server
		System.setProperty(key, value);   
        WebDriver driver= new FirefoxDriver();
        driver.get("file:///C:/Users/Ganesh/eclipse-workspace/Seleniumtest/src/AutomationTesting/Webpages/loc3.html");
        WebElement ele  = driver.findElement(By.linkText("facebook"));
        //wait for 3 seconds
        Thread.sleep(3111);
        //perform click action 
        ele.click();
        // close the driver 
		driver.close();
   }

  
}

