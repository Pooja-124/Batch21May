package TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePackage;
import pomPackage.Loginpage;


public class MaintestClass
{
	public static void main(String[] args) 
	{
		

		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
		 
		 //(verify login functionality)
		 
		 Loginpage login=new Loginpage(driver);
		  
		  login.sendUserName();
		  login.sendpassword();
		  login.clickOnLoginButton();
		  
		  // (verify home page)
		  
		  HomePackage home=new HomePackage(driver);
		  
		  home.verifyAdminTab();
		  home.verifyleaveTab();
		  home.verifyPIMTab();
	  }
	
}
