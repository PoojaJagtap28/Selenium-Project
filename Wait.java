package LaunchBrowser;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		// Implicit Wait : will wait for all web-elements
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		// Explicit wait: specific to the particular web-element
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	
		WebElement textarea=driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		textarea.sendKeys("Pooja");
		
		
        
		

	}

}
