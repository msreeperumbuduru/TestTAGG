package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;


public class Constant {

       public static final String URL = "http://s1.ajaya.me";
       public static WebDriver driver = null;
       
   	@BeforeSuite
   	public void launch() throws Exception {
   		
   		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
   		//Sprint3.driver = new ChromeDriver();
   		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
   		driver = new FirefoxDriver();
   		driver.manage().deleteAllCookies();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   		driver.get(URL);
       }
       

   }
   
   