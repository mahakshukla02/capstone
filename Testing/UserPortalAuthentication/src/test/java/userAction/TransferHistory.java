package userAction;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TransferHistory {

	@Test
	public void TransactionHistory() throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Novina_BNP\\Simplilearn_Projects\\Project 4\\Chrome Driver\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("http://localhost:4200/login");
		 */
		
		 System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    
		    driver.get("http://localhost:4200/home");
		    
	    Thread.sleep(5000);
	    
	    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		
		try 
		{
			
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[2]/a")).click();
			System.out.println("Transfer History Displayed");


		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();

	}
}
	
