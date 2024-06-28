package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfElements {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement firstname=driver.findElement(By.id("FirstName"));
    	WebElement male=driver.findElement(By.id("gender-male"));
		WebElement female=driver.findElement(By.id("gender-female"));
		System.out.println("Display Status: "+ firstname.isDisplayed());
		System.out.println("Enabled Status: "+ firstname.isEnabled());
		
		// selecting male radio button
		male.click();
		System.out.println("male button Select Status: "+ male.isSelected());
        System.out.println("Female button Select Status: "+ female.isSelected());
        
        // selecting female radio button
        female.click();
		System.out.println("male button Select Status: "+ male.isSelected());
        System.out.println("female button Select Status: "+ female.isSelected());
		
	}

}
