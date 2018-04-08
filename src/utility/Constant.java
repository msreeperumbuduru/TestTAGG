package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Constant {

       public static final String URL = "https://tagg-uno.herokuapp.com/";
       public static WebDriver driver = null;
       
   	@BeforeSuite(alwaysRun = true)
   	public void launch() throws Exception {
   		
   		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
   		driver = new ChromeDriver();
   		//System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
   		//driver = new FirefoxDriver();
   		driver.manage().deleteAllCookies();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   		driver.get(URL);
       }
   	
	
    //close driver
    @AfterSuite(alwaysRun = true)
    public void closebrowser() throws Exception{ 
   	 driver.close();
     }

   }
   
   