package appModules;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void Execute(WebDriver driver) throws Exception{
		System.out.print("Entered SS loop");		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\moni\\"+System.currentTimeMillis()+".png");	
		FileUtils.copyFile(src,dest);
		System.out.print("SS Captured");
	}

}

