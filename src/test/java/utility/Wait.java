package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait 
{
	static WebDriver driver;
	public static WebDriverWait ExplicitWait(String x,int y)
    {
	  
	
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
	  
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(x)));
	  
	   return wait;
    }
     public static void ImplicitWait(WebDriver driver)
	 {
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	  
  }
	
	
	
	
