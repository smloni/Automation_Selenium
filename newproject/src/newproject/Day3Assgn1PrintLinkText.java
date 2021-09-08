package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Assgn1PrintLinkText 
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
			//Using get() method to open a web page  
			 driver.get("http://www.google.co.in");
			 int size=driver.findElements(By.xpath("//input[@type='submit']")).size();
			 System.out.println("Total buttons in google home page: "+size);
			
			 //String x=driver.findElement(By.xpath("//*[@id='SIvCob']/a[1]")).getAttribute("href");
			 //System.out.println(x);
			 
			//Assignment- printing link text
			 int size1=driver.findElements(By.tagName("a")).size();
			 System.out.println("Total links in google home page: "+size1);
			 
			 for (int i=0;i<size1;i++)
			 {
				 String linkHref=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
				 String linktext=driver.findElements(By.tagName("a")).get(i).getText();
				 // myPrint(linktext);
				 System.out.println(linktext+" - "+linkHref);
										
			 }
	 
						 
			//Closing the browser  
			driver.quit();
	}  
			   
	

	public static void myPrint(Object vText)
	{
		System.out.println(vText);
	}
	
}
