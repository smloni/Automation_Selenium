package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
	
	 @Test		
		public static void main(String[] args) throws InterruptedException {  
		   
		//Creating a driver object referencing WebDriver interface  
		 WebDriver driver;
		   
		//Setting the webdriver.chrome.driver property to its executable's location  
		System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/Manoj/chromedriver.exe");
				       
		//Instantiating driver object  
		  driver = new ChromeDriver();
		 		   
		//Using get() method to open a web page  
		 driver.get("http://www.google.co.in");
		 //driver.findElement (By.xpath("//*[type='submit'")).getSize();
		 //System.out.println(driver.findElement (By.xpath("//*[@type='submit']"))).size();
		 int size=driver.findElements(By.xpath("//input[@type='submit']")).size();
		 System.out.println(size);
		System.out.println("TC is SUCCESS");
		int size1=driver.findElements(By.tagName("a")).size();
		 System.out.println(size1);
		//Closing the browser  
		driver.quit();
		}  
		   
}  