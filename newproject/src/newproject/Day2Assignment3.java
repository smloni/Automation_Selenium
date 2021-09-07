/**CASE STUDY 4:
1. Navigate to Clear Trip
2. Select Round Trip
3. Test Case should be Pass if the Return on Date element gets displayed only after selecting the Round Trip
4. Else FAIL
*/

package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Assignment3 {

	public static void main(String[] args) throws Exception {  
		   
		//Creating a driver object referencing WebDriver interface  
		 WebDriver driver;
		   
		//Setting the webdriver.chrome.driver property to its executable's location  
		System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/drivers/chromedriver.exe");
				       
		//Instantiating driver object  
		  driver = new ChromeDriver();
		 //Using get() method to open a web page  
		 driver.get("https://www.cleartrip.com/");
		 WebElement roundTripRadio=driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[2]/label[2]/div[1]/span"));
		 roundTripRadio.click();
		 try{
			 	 
		 WebElement returnOn=driver.findElement(By.xpath("//h4[text()='Return on']"));
		//*[@id="root"]/div/div/div[1]/div/div[2]/div/div[3]/div[2]/div[2]/h4
		 if(returnOn.isDisplayed()==true){
			System.out.println("Test case is PASS, 'Return ON' is displayed");
			
		 }else{
				System.out.println("Test case is FAIL, 'Return ON' is not visible");
			}
		
		 }catch(Exception e){
					System.out.println("Test case is FAIL, 'Return ON' is not Found");
		}
		 
		//Closing the browser  
		driver.quit();
		}  

}
