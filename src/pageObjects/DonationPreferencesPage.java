package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonationPreferencesPage {
private static WebElement element = null;
	
	public static WebElement input_monthlyBudget(WebDriver driver)
	{
		element = driver.findElement(By.id("monthlyBudget"));
		return element;
		}
	public static WebElement input_notice(WebDriver driver)
	{
		element = driver.findElement(By.id("noticeDays"));
		return element;
		}
	public static WebElement chk_k12(WebDriver driver)
	{
		element = driver.findElement(By.id("Education K-12"));
		return element;
		}
	public static WebElement chk_ysa(WebDriver driver)
	{
		element = driver.findElement(By.xpath("Youth Sports/Activities"));
		return element;
		}
	public static WebElement chk_fr(WebDriver driver)
	{
		element = driver.findElement(By.id("Faith/Religious"));
		return element;
		}
	public static WebElement chk_cg(WebDriver driver)
	{
		element = driver.findElement(By.id("Corporate Giving"));
		return element;
		}
	public static WebElement chk_aw(WebDriver driver)
	{
		element = driver.findElement(By.id("Animal Welfare"));
		return element;
		}
	public static WebElement chk_ach(WebDriver driver)
	{
		element = driver.findElement(By.id("Arts, Culture & Humanities"));
		return element;
		}
	public static WebElement chk_crsa(WebDriver driver)
	{
		element = driver.findElement(By.id("Civil Rights, Social Action & Advocacy"));
		return element;
		}

	public static WebElement chk_ci(WebDriver driver)
	{
		element = driver.findElement(By.id("Community Improvement"));
		return element;
		}

	public static WebElement chk_env(WebDriver driver)
	{
		element = driver.findElement(By.id("Environment"));
		return element;
		}

	public static WebElement chk_fan(WebDriver driver)
	{
		element = driver.findElement(By.xpath("Food, Agriculture & Nutrition"));
		return element;
		}
	public static WebElement chk_hc(WebDriver driver)
	{
		element = driver.findElement(By.id("Health Care"));
		return element;
		}
	public static WebElement chk_hs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("Human Services"));
		return element;
		}

	public static WebElement chk_others(WebDriver driver)
	{
		element = driver.findElement(By.xpath("Other"));
		return element;
		}
	public static WebElement chk_yes(WebDriver driver)
	{
		element = driver.findElement(By.id("yes"));
		return element;
		}
	public static WebElement chk_no(WebDriver driver)
	{
		element = driver.findElement(By.id("no"));
		return element;
		}
	public static WebElement chk_cashck(WebDriver driver)
	{
		element = driver.findElement(By.id("Cash/Check"));
		return element;
		}
	public static WebElement chk_gift(WebDriver driver)
	{
		element = driver.findElement(By.id("Gift Card"));
		return element;
		}
	public static WebElement chk_prod(WebDriver driver)
	{
		element = driver.findElement(By.id("Product/Service Donation"));
		return element;
		}
	public static WebElement chk_spon(WebDriver driver)
	{
		element = driver.findElement(By.id("Sponsorship/Awareness"));
		return element;
		}
	public static WebElement chk_othdon(WebDriver driver)
	{
		element = driver.findElement(By.id("Other (please explain)"));
		return element;
		}
	public static WebElement input_amtreq(WebDriver driver)
	{
		element = driver.findElement(By.id("amtReq"));
		return element;
		}
	public static WebElement btnSave(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		return element;
		}
	public static WebElement saveMsg(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[starts-with(@class,'alert')]"));
		return element;
		}
	public static WebElement listChk(WebDriver driver)
	{
	
	WebElement checkboxeslist = driver.findElement(By.name("OrgTypeId[]"));  
	List<WebElement> eachcheckbox = checkboxeslist.findElements(By.cssSelector("input:checked[type='checkbox']"));  
	for (int i = 0; i < eachcheckbox.size(); i++) 
		{ 
			if(eachcheckbox.get(i).isSelected())
				eachcheckbox.get(i).click(); 
		}
	return checkboxeslist; 
	}
}
		
	//isChecked = e.findElement(By.tagName("input")).Selected;
	//isChecked = e.findElement(By.tagName("input")).isSelected();
