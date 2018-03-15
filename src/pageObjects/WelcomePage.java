package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {
	
	public static WebElement element = null;
	
	public static WebElement lnk_Login(WebDriver driver)
	{   
		element = driver.findElement(By.partialLinkText("Login"));
		return element;
	}

	
	public static WebElement lnk_SignUp(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Sign Up"));
		return element;
	}
	public static WebElement lnk_Pricing(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Pricing"));
		return element;
	}
	public static WebElement lnk_HowItWorks(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("How This Works")); 
		return element;
	}
	
	public static WebElement lnk_AboutUs(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("About Us"));
		return element;
	}
	
	public static WebElement lnk_smallTrialMo(WebDriver driver)
	{
		element = driver.findElement(By.id("small"));
		return element;
	}

	public static WebElement lnk_MediumTrialMo(WebDriver driver)
	{
		element = driver.findElement(By.id("medium"));
		return element;
	}
	
	public static WebElement lnk_LargeTrialMo(WebDriver driver)
	{
		element = driver.findElement(By.id("large"));
		return element;
	}
	public static WebElement lnk_UnlimitedTrialMo(WebDriver driver)
	{
		element = driver.findElement(By.id("unlimited"));
		return element;
	}
	public static WebElement lnk_smallTrialYr(WebDriver driver)
	{
		element = driver.findElement(By.id("small1"));
		return element;
	}

	public static WebElement lnk_MediumTriaYr(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"medium\"]"));
		return element;
	}
	
	public static WebElement lnk_LargeTrialYr(WebDriver driver)
	{
		element = driver.findElement(By.id(""));
		return element;
	}
	public static WebElement lnk_UnlimitedTrialYr(WebDriver driver)
	{
		element = driver.findElement(By.id("unlimited1"));
		return element;
	}
	public static WebElement lnk_Yearly(WebDriver driver)
	{
		element = driver.findElement(By.id("option2"));
		return element;
	}
	public static WebElement lnk_Monthly(WebDriver driver)
	{
		element = driver.findElement(By.id("option1"));
		return element;
	}
	public static WebElement lnk_bottomSignUp(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Sign Up !"));
		return element;
	}
	public static WebElement lnk_topCharityQ(WebDriver driver)
	{
		element = driver.findElement(By.id("logo"));
		return element;
	}
}
