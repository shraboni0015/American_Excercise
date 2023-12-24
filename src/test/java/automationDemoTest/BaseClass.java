package automationDemoTest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
    @BeforeMethod
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		//driver.get("https://automationexercise.com/");
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	
	
	
		
	}@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
   }	

}

	
	
	


