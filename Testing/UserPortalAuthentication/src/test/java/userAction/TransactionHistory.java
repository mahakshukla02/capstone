package userAction;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TransactionHistory {

	@Test
	public void TransactionHistory() throws InterruptedException {
		
		  System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    
		    driver.get("http://localhost:4200/home");
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "src/main/resources/chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("http://localhost:4200/login");
		 */
	    Thread.sleep(5000);
	    

		try 
		{
			
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[1]/a")).click();
			System.out.println("Transaction History Displayed");
			
			  
		    driver.findElement(By.xpath("//*[@id=\"navbardrop\"]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[5]/div/a[2]")).click();
		   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
		   System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();

	}
}
