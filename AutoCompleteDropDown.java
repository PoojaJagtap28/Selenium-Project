package LaunchBrowser;

import java.lang.classfile.WritableElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoCompleteDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement location=driver.findElement(By.id("autocomplete"));
		
		location.clear();
		location.sendKeys("Toronto");
		Thread.sleep(100);
		
		String text;
		
		do {
			
			location.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text=location.getAttribute("value");

			if(text.equals("Toronto NSW, Australia")) {
				
				location.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				break;
			
			
			}
			
			Thread.sleep(3000);
		} while(!text.isEmpty());
		
	}

}
