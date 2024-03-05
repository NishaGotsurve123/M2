package CommonUtils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	   // public WebDriver d ;
	   WebDriver d = new ChromeDriver();
	   PropertyFileUtil putil = new PropertyFileUtil();
	   WebDriverUtil wutil = new WebDriverUtil();
	   @BeforeSuite
	   public void BS() {
		   System.out.println("Connect to DataBase");

	  }
	   
	   @BeforeClass
	   public void BC() throws IOException{
		   
		   // Before class is used to launch the application
		     String URL = putil.getDataFromPropertyFile("url");
		     WebDriver d = new ChromeDriver();
		     d.manage().window().maximize();
		     d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		     d.get(URL);
	   }
	   
	   @BeforeMethod
	   public void BM()throws IOException{
		   
		   // Before Method is used to login the application
		       String USERNAME = putil.getDataFromPropertyFile("Username");
		       String PASS = putil.getDataFromPropertyFile("Password");
		       d.findElement(By.name("user_name")).sendKeys(USERNAME);
		       d.findElement(By.name("userpassword")).sendKeys(PASS);
		       d.findElement(By.id("submitButton")).click();
		       
	   }
	   
	   @AfterSuite
	   public void AS() {
		   System.out.println("Disconnect From DataBase");
	   }
	   
	   @AfterClass
	   public void AC() {
		   // @AfterSuite is Used to close the browser
		      d.quit();
		      
	   }
	   
	   @AfterMethod
	   public void AM() throws InterruptedException {
		   // @AfterMethod is used to logout from the Application
		      WebElement img = d.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG\']"));
		   // Actions a = new Actions(d);
		   // a.moveToElement(img);
		   // a.perform();
		     Thread.sleep(2000);
		     wutil.mouseHover(d, img);
		  // Click on Sign out
		    d.findElement(By.xpath("//a[test()='Sign Out']")).click(); 
		     
				
	 }

}
