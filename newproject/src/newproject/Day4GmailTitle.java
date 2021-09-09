package newproject;
import java.nio.charset.Charset;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4GmailTitle 
{
		
		
	public static void main(String[] args) throws InterruptedException
	{  
			   
			//Creating a driver object referencing WebDriver interface  
			 WebDriver driver;
			   
			//Setting the webdriver.chrome.driver property to its executable's location  
			System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/Manoj/chromedriver.exe");
					       
			//Instantiating driver object  
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			   driver.get("https://www.google.com/gmail/about/#");
			  System.out.println(driver.getTitle());
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//ul/li[@class='h-c-footer__global-links-list-item h-c-footer__global-links-list-item--extra']/a[@class='h-c-footer__link']")).click();
			 
			  Set<String> wIDs=driver.getWindowHandles();
			  
			  java.util.Iterator<String> wIt=wIDs.iterator();
			  
			  String parentID=wIt.next();
			  String childID=wIt.next();
			  driver.switchTo().window(childID);
			 			  
			   Thread.sleep(2000);
			  System.out.println(driver.getTitle());
			 	 
						 
			//Closing the browser  
			driver.quit();
	}  
			   

}
