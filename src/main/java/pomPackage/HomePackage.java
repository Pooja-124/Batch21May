package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePackage
{
	@FindBy (xpath="//*[text()='Admin']")
	private WebElement admin;
	
	@FindBy (xpath="//*[text()='PIM']")
	private WebElement PIM;
	
	@FindBy (xpath="//*[text()='Leave']")
	private WebElement leave;
	
	public HomePackage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public boolean verifyAdminTab()
	{
		boolean result=admin.isDisplayed();
		return result;
	}
	public void verifyPIMTab()
	{
		PIM.isDisplayed();
	}
	public void verifyleaveTab()
	{
		leave.isDisplayed();
	}

}
	
	
	


