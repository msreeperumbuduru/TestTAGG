package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class LogoutPage {
private static WebElement element = null;
	
public static WebElement lnk_user(WebDriver driver)
{
	element = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/ul/li[5]/a"));
	return element;
	}

	public static WebElement lnk_logout(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Logout"));
		return element;
		}
}

