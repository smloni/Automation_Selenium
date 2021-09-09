package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4AssgnMouseOver {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Automation_Shared/Manoj/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.Youcandealwithit.com");
        Thread.sleep(2000);
        Actions act=new Actions(driver);
    	WebElement VFisrt=driver.findElement(By.xpath("//a[@href='/borrowers/index.shtml']"));
    	act.moveToElement(VFisrt).build().perform();
    	Thread.sleep(2000);
    	act.moveToElement(driver.findElement(By.xpath("//a[text()='Calculators & Resources']"))).build().perform();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[text()='Calculators & Resources']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[text()='Calculators']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[text()='Budget Calculator']")).click();
    	Thread.sleep(1000);
    	System.out.println(driver.getTitle());
    	driver.quit();

	}

}
