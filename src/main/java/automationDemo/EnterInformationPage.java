package automationDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterInformationPage {
	WebDriver driver;
	By titlename = By.name("title");
	By passcode = By.id("password");
	By datebox = By.xpath("(//select[@id='days'])/option[16]");
	By monthbox = By.xpath("(//select[@id='months'])/option[13]");
    By yearlist = By.xpath("(//select[@id='years'])/option[5]");
	By letterbtn = By.name("newsletter");
	By namef = By.id("first_name");
	By namel = By.id("last_name");
	By companyname = By.id("company");
	By addresslog = By.id("address1");
	By countryber = By.xpath("(//select[@id='country'])/option[4]");
	By statename = By.id("state");
	By citylocation = By.id("city");
	By zip = By.id("zipcode");
	By number = By.id("mobile_number");
	By account = By.xpath("//button[text()='Create Account']");
	
	
	  public EnterInformationPage(WebDriver driver) {
	  this.driver = driver;
	}
	public void userpage() throws InterruptedException {
	driver.findElement(titlename).click();
	driver.findElement(passcode).sendKeys("test2023");
	WebElement birthbox = driver.findElement(datebox);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",birthbox);
	birthbox.click();
	driver.findElement(monthbox).click();
	driver.findElement(yearlist).click();
	Thread.sleep(5000);
	WebElement signupbtn= driver.findElement(letterbtn);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",signupbtn);
    signupbtn.click();
    driver.findElement(namef).sendKeys("Monowara");
    driver.findElement(namel).sendKeys("Sultana");
    driver.findElement(companyname).sendKeys("Hutbazar");
    driver.findElement(addresslog).sendKeys("22-27 167st");
    WebElement countryoption= driver.findElement(countryber);
   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",countryoption);
    countryoption.isSelected();//but is not visiable AUSTRALIA
   
    driver.findElement(statename).sendKeys("ny");
    driver.findElement(citylocation).sendKeys("queens");
    driver.findElement(zip).sendKeys("12345");
    driver.findElement(number).sendKeys("34724568900");
    
    Thread.sleep(3000);
   // WebElement hitbtn = driver.
   // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",hitbtn);
   // hitbtn.click();
   
       try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	}
	
	}


