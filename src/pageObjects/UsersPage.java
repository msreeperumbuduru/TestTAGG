package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class UsersPage {
private static WebElement element = null;
	
	public static WebElement btn_AddUser(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Add"));
		return element;
		}
	public static WebElement btn_EditUser(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/a[2]"));
		return element;
		}
	public static WebElement btn_DeleteUser(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/a[3]"));
		return element;
		}
	//create a user page
	public static WebElement input_firstname(WebDriver driver)
	{
		element = driver.findElement(By.id("first_name"));
		return element;
		}
	public static WebElement input_lastname(WebDriver driver)
	{
		element = driver.findElement(By.id("last_name"));
		return element;
		}
	public static WebElement input_emailAddr(WebDriver driver)
	{
		element = driver.findElement(By.name("email"));
		return element;
		}

	public static Select drpdwn_location(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.name("location")));
		return element;
		}
	public static Select drpdwn_role(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.name("role_id")));
		return element;
		}

	public static WebElement submit(WebDriver driver)
	{
		element = driver.findElement(By.id("createbutton"));
		return element;
		}
	public static WebElement cancel(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//input[@value=Cancel]"));
		return element;
		}
	
	//update profile page
	public static WebElement input_editfirstname(WebDriver driver)
	{
		element = driver.findElement(By.id("first_name"));
		return element;
		}
	public static WebElement input_editlastname(WebDriver driver)
	{
		element = driver.findElement(By.id("last_name"));
		return element;
		}
	public static WebElement input_editemailAddr(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
		}

	public static Select drpdwn_editbsnlocation(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.name("organization_id")));
		return element;
		}
	public static Select drpdwn_editrole(WebDriver driver)
	{
		Select element = new Select(driver.findElement(By.name("role_id")));
		return element;
		}

	public static WebElement btn_update(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div//input[@value=Update]"));
		return element;

	}
	public static WebElement UpProfileCancel(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[7]/div/input[2]"));
		return element;
		}

	public static WebElement checkemptytable(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div/div/div[2]/table/tbody"));
		return element;
	}
	

}