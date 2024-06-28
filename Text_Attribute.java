package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Text_Attribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement first=driver.findElement(By.id("FirstName"));
		first.sendKeys("Pooja");
		System.out.println(first.getText());
		
		first.clear();
		
		
		
		WebElement reg_btn=driver.findElement(By.name("register-button"));
	    System.out.println(reg_btn.getText());    // REGISTER
	    
		
		System.out.println(first.getAttribute("data-val-required"));  //First name is required.
		driver.close();
	}
	
	

}
