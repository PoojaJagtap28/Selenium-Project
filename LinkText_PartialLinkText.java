package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLinkText {

	public static void main(String[] args) {


     	WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		// linkText() method
		WebElement linktext=driver.findElement(By.linkText("Today's Deals"));
		System.out.println("You Clicked on "+ linktext.getText());
		linktext.click();
		
        // partialLinktext() method
		
//		WebElement linktext=driver.findElement(By.partialLinkText("Deals"));
//		linktext.click();
		
		// locate links using tagName() method
		
		List<WebElement> no= driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: "+ no.size());
		
		for(WebElement link:no) {
			System.out.println(link.getText());
			//System.out.println(link.getAttribute("href"));
		}
		
	}

}
