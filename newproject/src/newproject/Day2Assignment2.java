/**CASE STUDY 3:
1. Navigate to http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml
2. Enter Food, Clothing, Shelter (Enter through a variable)
3. Enter Monthly Pay and Monthly Others (Enter through a variable)
4. Add the Variables Food, Clothing, Shelter and Store it in a variable vMExp
5. Add the variables Monthly Pay and Monthly Others and store it in a variable vMInc
6. Capture Monthly Income and Monthly Expense from application
7. Monthly Income from the appln should be same as added value (STEP 5)
8. Monthly Expense from the appln Should be same as added Value (STEP 4)
9. if does not match TEST CASE FAIL else PASS
*/
package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Assignment2 {
	public static void main(String[] args) throws InterruptedException {  
		   
		//Creating a driver object referencing WebDriver interface  
		 WebDriver driver;
		   
		//Setting the webdriver.chrome.driver property to its executable's location  
		System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/drivers/chromedriver.exe");
				       
		//Instantiating driver object  
		  driver = new ChromeDriver();
		  
		 //Test Data - monthly expenses-food, cloth shelter
		  	 String vFood="400";
			 String vCloth="300";
			 String vShelter="500";	
		//Test Data - monthly earnings - Pay & Others
			 String vMPay="3000";
			 String vMOther="2000";	
		//Using get() method to open a web page  
		 driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
			driver.manage().window().maximize();
			WebElement objFood= driver.findElement(By.id("food"));
		 	WebElement objvCloth= driver.findElement(By.id("clothing"));
			WebElement objvShelter= driver.findElement (By.id("shelter"));
			WebElement objMntPay= driver.findElement(By.id("monthlyPay"));
			WebElement objMntOther= driver.findElement(By.id("monthlyOther"));
			Thread.sleep(1000);
			objFood.sendKeys(vFood);
			objvCloth.sendKeys(vCloth);
			objvShelter.sendKeys(vShelter);
			objMntPay.sendKeys(vMPay);
			objMntOther.sendKeys(vMOther);
			Thread.sleep(2000);
			
			//Add Expenses
			double vMExp=Integer.parseInt(vFood)+Integer.parseInt(vCloth)+Integer.parseInt(vShelter);
			//Add Earnings
			double vMInc=Integer.parseInt(vMPay)+Integer.parseInt(vMOther);
			System.out.println(vMExp);
			System.out.println(vMInc);
			Thread.sleep(2000);
			//Capture Monthly Income and Monthly Expense from application
			String vMPayApp=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
			double c=Double.parseDouble(vMPayApp);
			String vMIncomeApp=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
			double d=Double.parseDouble(vMIncomeApp);
			System.out.println(c);
			System.out.println(d);
			if (((vMExp)!=Double.parseDouble(vMPayApp))|| ((vMInc)!=(Double.parseDouble(vMIncomeApp)))){
				System.out.println("Test Case is FAIL");
			}
			else{
				System.out.println("Test Case is PASS");
			}
		
		//Closing the browser  
		driver.quit();
		}  
	
}

