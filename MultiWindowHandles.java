package LaunchBrowser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jenkins.io/");
		driver.manage().window().maximize();
		
		// getWindowHandle()  ---returns a id for single browser window
		
//		String windowid=driver.getWindowHandle();
//		System.out.println("Window Id : "+windowid);
		
		
		// getWindowHandle()  ---returns ids for multiple browser windows
		
		driver.findElement(By.xpath("//a[text()='Atlassian']")).click();
		Set <String> winids= driver.getWindowHandles();
		
		ArrayList <String> list=new ArrayList(winids);
		for(String id:list) {
			
			String title=driver.switchTo().window(id).getTitle();
			System.out.println("Title: " + title + "\nWindow ID: "+ id);
			if(title.equalsIgnoreCase("Jenkins")) {
				driver.close();
			}
			
			
			
		}
		

		
	}

}
