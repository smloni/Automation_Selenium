package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;
@Test
public class NewTest {
	    private ChromeDriver driver;

	    @BeforeMethod
	    public void beforeMethod(){
	        driver = new ChromeDriver();
	       Reporter.log("Created");
	     }

	     @AfterMethod
	     public void afterMethod(){
	         driver.quit();
	         //additional tear down 
	     }

	     public ChromeDriver getDriver (){
	         return driver;
	    	 
	     }
	    
	     
	}


