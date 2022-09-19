package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pomPackage.HomePackage;
import pomPackage.Loginpage;
import utility.CaptureScreenshot;
import utility.Pojo;

public class TestClassA_TestNG extends Pojo
{
   WebDriver driver;
   SoftAssert s=new SoftAssert();
   HomePackage home;
   ExtentTest logger;
   ExtentReports extent;
   @BeforeClass
   public void beforeClass()
   {
	   WebDriver driver=OpenChromeBrowser();
	   this.driver=driver;
	   ExtentHtmlReporter reporter=new ExtentHtmlReporter("./test-output/velocity.html");
	   extent=new ExtentReports();
	   extent.attachReporter(reporter);
	   logger=extent.createTest("verifyLoginPage");
	   logger=extent.createTest("verifyHomePackage");
   }
   @Test(priority=0)
   public void verifyLoginPage() throws InterruptedException
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
		 // System.out.println("pooja");
		  
		  // s.assertNotEquals(ActualURL,ExpectUrl);
		  s.assertAll();
   }
   @Test(priority=1)
   public void verifyHomePackage()
   {
	   System.out.println("Hello");
   }
   @AfterMethod
   public void afterMethod(ITestResult result) throws IOException
   {
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
		  String path=CaptureScreenshot.CaptureScreenshot(driver) ;
		  logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	   }
	     extent.flush();
   }
}
	
	
	
	
	
	

