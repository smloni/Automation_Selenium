/**CASE STUDY 2: 
1. OPEN GOOGLE.COM
2. Enter Selenium
3. Click Google Search
4. It should navigate to Result Page (Contain the Title Selenium) 
	Then PASS: Navigated to the Result Page
5. Your Input(SELENIUM) in the Home Page should be same as the OUTPUT Search Text (SELENIUM)
	Then PASS: Search Engine works as expected
6. Print the Time Taken to Search the Data
7. Close the Browser
*/
package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Day2Assignment1 {

		public static void main(String[] args) throws InterruptedException {  
			   
			//Creating a driver object referencing WebDriver interface  
			 WebDriver driver;
			   
			//Setting the webdriver.chrome.driver property to its executable's location  
			System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/drivers/chromedriver.exe");
					       
			//Instantiating driver object  
			  driver = new ChromeDriver();
			 String vInput="SELENIUM";
			//Using get() method to open a web page  
			 driver.get("http://www.google.co.in");
			 driver.findElement (By.name("q")).click();
			 driver.findElement (By.name("q")).sendKeys(vInput);
			 driver.findElement (By.name("btnK")).submit();
			String vTitle = driver.getTitle();
			if (vTitle.contains("SELENIUM")){
				System.out.println("TC1- PASS: Navigated to the Result Page");
			}
			else {
				System.out.println("FAIL: Not landed on expected page");
			}
			String vGetValue=driver.findElement (By.name("q")).getAttribute("value");
			if(vGetValue.equals(vInput)){
				System.out.println("TC2- PASS: Search Engine works as expected");
			}
			else {
				System.out.println("FAIL: Search is not working properly");
			}
			//String vTimeTaken=driver.findElement(By.xpath("/html/body/div[7]/div/div[6]/div/div/div/div/div/nobr")).getText();
			String vTimeTaken=driver.findElement(By.xpath("//*[@id='result-stats']/nobr")).getText();
			System.out.println("Time take to search:"+vTimeTaken);
			//Closing the browser  
			driver.quit();
			}  
		
	}




