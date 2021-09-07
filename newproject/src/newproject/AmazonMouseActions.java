package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   
				//Creating a driver object referencing WebDriver interface  
				 WebDriver driver;
				   
				//Setting the webdriver.chrome.driver property to its executable's location  
				System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/Manoj/chromedriver.exe");
						       
				//Instantiating driver object  
				  driver = new ChromeDriver();
				 		   
				//Using get() method to open a web page  
				 driver.get("https://www.amazon.com/");
				 Thread.sleep(1000);
				 Actions act=new Actions(driver);
				 
				 act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
				 String vTitle=driver.getTitle();
				 System.out.println(vTitle);
				 if(vTitle.contains("Amazon Sign-In")){
					 System.out.println("PASS");
				 }
				 else{
					 System.out.println("FAIL");
				 }
				 
				 //System.out.println(size1);
					//Closing the browser  
					driver.quit();

	}

}
