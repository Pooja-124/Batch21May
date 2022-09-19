package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePackage;
import pomPackage.Loginpage;
import utility.CaptureScreenshot;
import utility.ExcelData;
import utility.Pojo;

public class Assertion extends Pojo
{

	static WebDriver driver;
	SoftAssert s;
	@BeforeClass
	public void beforeclass()
	{
         
		// System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		 
		// WebDriver driver=new ChromeDriver();
		 
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		// driver.manage().window().maximize();
		
		WebDriver driver=OpenChromeBrowser();
		this.driver=driver;
   }
	
	@Test
	public void verifyLoginpage() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver);
		  login.sendUserName();
		  login.sendpassword();
		  login.clickOnLoginButton();
		  
		  Thread.sleep(2000);
		  
		  String ActualURL=driver.getCurrentUrl();
		   System.out.println(ActualURL);
		  String ExpectURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  
		  // Assert.assertEquals(ActualURL,ExpectUrl); // false
		  // Assert.assertNotEquals(ActualURL,ExpectUrl); 
		  
		  s=new SoftAssert();
		  s.assertEquals(ActualURL, ExpectURL); // fail
		  System.out.println("pooja");
		  
		  // s.assertNotEquals(ActualURL,ExpectUrl);
		  s.assertAll();
		  CaptureScreenshot.CaptureScreenshot(driver);
		
	 }
	  @Test(priority=1)
	  public void verifyhomepackage() throws InterruptedException, EncryptedDocumentException, IOException
	  {
		  
		  HomePackage home=new HomePackage(driver);
		  
		  Thread.sleep(2000);
		//  ExcelData.importExcelData(4,1);
		  
		  boolean result=home.verifyAdminTab();
		  home.verifyleaveTab();
		  home.verifyPIMTab();
		  
		  Assert.assertTrue(result);
		  // Assert.assertFalse(result);
	      s.assertAll();
	  }
	  @AfterClass
	  public void quit()
	  {
		  driver.quit();
	  }
}	
	
	
	
	
	
	

