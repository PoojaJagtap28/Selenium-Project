package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		/*1- FindElement method returns first element only even if having multiple web-elements associated with it
		  2 -FindElement method throws exception if web-element not found
		*/
		WebElement search= driver.findElement(By.xpath("//div[@class='footer']//a"));
		System.out.println(search.getText());

		
		
	    /* 1- FindElements method returns all web-elements associated with it 
	       2- We can access elements by iterating using loop ( return type List<WebElement> )
		   3- It doesn't throw exception if web-element not found. Instead returns 0 web-element
		*/
		
		List<WebElement> footerele=driver.findElements(By.xpath("//div[@class='footer']//a"));
		System.out.println("No of elements present: "+footerele.size());
		for(WebElement ele:footerele)
		{
			System.out.println(ele.getText());
		}	
		
		driver.close();
			

	}


}
