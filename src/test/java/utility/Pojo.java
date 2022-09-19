package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo 
{
  public static WebDriver OpenChromeBrowser()
  {
	
     System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	return driver;
  }
}
