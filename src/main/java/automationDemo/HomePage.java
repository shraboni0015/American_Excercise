package automationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	private  static By signin = By.xpath("//a[text()=' Signup / Login']");
	By username =By.name("name");
	By useremail =By.xpath("(//input[@type='email'])[2]");
	By submitbtn =By.xpath("(//button[@type='submit'])[2]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	} 
	public EnterInformationPage usersignup() throws InterruptedException {
		
		driver.findElement(signin).click();	
		driver.findElement(username).sendKeys("timenteach");
	    driver.findElement(useremail).sendKeys("qauser2023@gmail.com");
		driver.findElement(submitbtn);
		Thread.sleep(4000);
	    return new EnterInformationPage(driver);
	
	}
	
}
