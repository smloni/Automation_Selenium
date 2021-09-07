package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	
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
		 driver.findElement (By.name("q")).click();
		 driver.findElement (By.name("q")).sendKeys("Loni");
		 driver.findElement (By.name("q")).submit();
		WebElement el = driver.findElement(By.id("lu_map"));
		Assert.assertEquals(el.getTagName(), "img");
		Reporter.log(el.getTagName());
		System.out.println("TC is SUCCESS");
		//Closing the browser  
		driver.quit();
		}  
		   
}  