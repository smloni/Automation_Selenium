package newproject;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersTitle {
	
	public static void main(String[] args) throws InterruptedException
	{
		/**
		 * CASE STUDY DAY 1:
		 * When the User Enters Chrome, Script should check the Title in Chome
		 * When the User Enters Firefox, Script should check the Title in Firefox
		 * When the User Enters anoy Other, Script should say ERROR : UNSUPPORTED BROWSER
		 */
			
				System.out.println("Welcome to Browser Title check program");
				System.out.println("--------------------------------------");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter your choice of browser you want to execute the test script");
				System.out.println("1-Chrome"+"  "+"2-Firefox"+"   "+"3-Any Other");
				String input=sc.nextLine();
				int choice=Integer.parseInt(input);
						
				//Creating a driver object referencing WebDriver interface  
				 WebDriver driver;
				 
				switch(choice){
					case 1: 
												   
						//Setting the webdriver.chrome.driver property to its executable's location  
						System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/drivers/chromedriver.exe");
								       
						//Instantiating driver object  
						  driver = new ChromeDriver();
						 		   
						//Using get() method to open a web page  
						 driver.get("https://www.linkedin.com/");
						 Thread.sleep(3000);
						 String vTitle1 = driver.getTitle();
							if( vTitle1.contains("LinkedIn"))
							{
							 System.out.println("Browser Title = "+vTitle1);
							 System.out.println("TC execution in Chrome is SUCCESS");
							}
							else{
								System.out.println("TC execution in Chrome is FAIL");
					}
						 //Closing the browser  
						 driver.quit();
						 break;
					 case 2: 
						//Creating a driver object referencing WebDriver interface  
						 //WebDriver driver;
						   
						//Setting the webdriver.gecko.driver property to its executable's location  
						//webdriver.firefox.marionette OR webdriver.gecko.driver
						 System.setProperty("webdriver.gecko.driver","C:/Automation_Shared/drivers/geckodriver.exe");
						
						//Instantiating driver object  
						driver = new FirefoxDriver();
					 		   
						//Using get() method to open a web page  
						 driver.get("https://www.linkedin.com/");
						 Thread.sleep(3000);
						 String vTitle = driver.getTitle();
						if( vTitle.contains("LinkedIn"))
						{
						 System.out.println("Browser Title = "+vTitle);
						 System.out.println("TC execution in Firefox is SUCCESS");
						}
						else{
							System.out.println("TC execution in Firefox is FAIL");
				}
						 //Closing the browser  
						 driver.quit();
						 break;
											
					 case 3: 
						System.out.println("ERROR : UNSUPPORTED BROWSER");
						break;
					}
			}
}
