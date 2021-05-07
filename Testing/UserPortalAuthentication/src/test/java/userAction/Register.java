package userAction;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Register {

	@Test
	public void register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://localhost:4200/login");
	    Thread.sleep(5000);
	    
	    try {
	    	//WebDriverWait wait=new WebDriverWait(driver, 14);
	    	driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/a")).click();
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[1]/input")).sendKeys("Mahak");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[2]/input")).sendKeys("Shukla");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[3]/input")).sendKeys("mahak");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[4]/input")).sendKeys("mahaks123");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[5]/input")).sendKeys("02/10/1999");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[6]/input")).sendKeys("7666854389");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[7]/input")).sendKeys("Indore");
	    	Select id=new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[8]/select")));
	    	id.selectByIndex(2);
	    	WebElement fileInput = driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[9]/input"));
	    	fileInput.sendKeys("D:\\dinos.png");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[10]/input")).sendKeys("mahak1234");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[11]/input")).sendKeys("mahaks.97@gmail,com");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[12]/button")).click();
	    	Thread.sleep(5000);
	    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
	    	System.out.println("Registration Successfull");
	    }
	    catch(Exception e) {
	    	System.out.println("Erro in web browser\nPlease have a look");
	    }
	    Thread.sleep(5000);  
	    driver.quit();
	}
}