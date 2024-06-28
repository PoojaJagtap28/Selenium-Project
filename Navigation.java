package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.jenkins.io/");
		 driver.manage().window().maximize();
		 System.out.println("Title of URL: "+ driver.getTitle());
		 System.out.println("URL of page: "+ driver.getCurrentUrl());
		 System.out.println("Page Source: "+ driver.getPageSource());
		 driver.findElement(By.linkText("More info")).click();
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.google.co.in/");
		 driver.close();
	}

}
