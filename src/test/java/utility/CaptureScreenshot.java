package utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

		
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot

{
	public static String CaptureScreenshot(WebDriver driver) throws IOException
	{

	Calendar cal=Calendar.getInstance();
	Date time=(Date) cal.getTime();
	String timestamp=time.toString().replace(":", "").replace(" ", " ");
	
	 
	File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\pooja\\"+timestamp+".jpeg");
		FileHandler.copy(source,dest);
		return timestamp;
	}
}
	
	
	
	
	
