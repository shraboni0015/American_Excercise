package automationDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductPage extends BaseClass{
	 public WebDriver driver;
	
    By panelbox = By.xpath("(//div[@class='panel-heading'])[3]");
    By dressbox = By.xpath("//a[text()='Tops & Shirts ']"); 
	By itembox = By.xpath("(//div[@class='features_items'])/div");
	
	
	public ProductPage (WebDriver driver) {
		this.driver = driver;
			
	}	
	public void productlist() throws InterruptedException{
		
		WebElement kidbtn = driver.findElement(panelbox); 
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",kidbtn);
		kidbtn.click();
		WebElement dresscode = driver.findElement(dressbox);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",dresscode );
		//dresscode.click();
//		List<WebElement> alldressber = (List<WebElement>) driver.findElement(itembox).getSize();
//      System.out.println(((WebElement) itembox).getText());
//      List<WebElement> alldressber =driver.findElements(itembox);
//		List<WebElement>alldressber1  = new Select(dresscode).getOptions();
//		for(WebElement option : alldressber1) {
//		System.out.println(((WebElement) alldressber1).getText());
        
        driver.findElement(itembox).getSize();

		Thread.sleep(4000);
	
	
	
	
	}

}
