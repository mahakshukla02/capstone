package authentication;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	 @Test
	  public void LoginTest() throws InterruptedException {
	    
	    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("http://localhost:4200/login");
	    Thread.sleep(5000);
	    
	    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[1]/input")).sendKeys("mdalal");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[2]/input")).sendKeys("mansi123");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/button")).click();
		try 
		{
			WebDriverWait wait=new WebDriverWait(driver, 14);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("http://localhost:4200/home")));
			System.out.println("Login Successfull");


		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();
	  }
	
}
