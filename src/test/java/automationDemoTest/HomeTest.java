package automationDemoTest;

import org.testng.Assert;

import org.testng.annotations.Test;
import automationDemo.BaseClass;
import automationDemo.EnterInformationPage;
import automationDemo.HomePage;
import automationDemo.ProductPage;


public class HomeTest extends BaseClass  {
	//WebDriver driver;
	HomePage homepage;
	EnterInformationPage informationpage;	
	ProductPage propage; 
	@Test	
	public void verifyhomepage() throws InterruptedException {
		homepage = new HomePage(driver);
		informationpage = new EnterInformationPage(driver);
		String actualUrl ="https://automationexercise.com/products";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		Thread.sleep(3000);
	}
	@Test	
	public void signin() throws InterruptedException {
		homepage = new HomePage(driver);
		informationpage=homepage.usersignup();
	    informationpage.userpage();
	    Thread.sleep(3000);
	}	
	@Test	
	public void verifyproductpage(){
		homepage = new HomePage(driver);
		propage = new ProductPage(driver);
		String actualUrl ="https://automationexercise.com/products";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl );
		
	}
	@Test
	  public void additem() throws InterruptedException {
		homepage = new HomePage(driver);
		propage = new ProductPage(driver);
		propage.productlist();
	 
	
	 } 
}
