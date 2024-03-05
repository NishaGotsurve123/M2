package CommonUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {
	
	public void Maximize(WebDriver d)
	{
		d.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver d)
	{
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void handleDropdown(WebElement element, String targetedelement)
	{
		Select s = new Select(element);
		s.deselectByVisibleText(targetedelement);
	}
	
	public void mouseHover(WebDriver d, WebElement element) {
		Actions a = new Actions(d);
		a.moveToElement(element);
		a.perform();
		
	}
	
	public void switchWindow(WebDriver driver, String eurl)
	{
		       Set<String> ids = driver.getWindowHandles();
		       for(String e: ids)
		       {
		    	   String actualurl = driver.switchTo().window(e).getCurrentUrl();
		    	   if(actualurl.contains(eurl))
		    	   {
		    		   break;
		    	   }
		       }
	}
	
	public File ScreenShot(WebDriver driver, String ScreenShotname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("./ScreenShot/"+ScreenShotname+".png");
		FileUtils.copyDirectory(tempfile, destinationfile);
		return destinationfile;
	}

	
	}


	
	
	


