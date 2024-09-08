import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		driver = new ChromeDriver();
		
		
		
	}

	@Test
	public void doLogin(){
		
		
		driver.get("http://gmail.com");
		//new comment
		
//		driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
//		driver.findElement(By.id("Pawd")).sendKeys("sdfdsf");
	/*
	 * 
	 * added new comments
	 * 
	 */
	
	
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
	
}
