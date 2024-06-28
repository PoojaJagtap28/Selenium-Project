package LaunchBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		// Single Frame

		driver.switchTo().frame("SingleFrame");
		System.out.println("In Frame");

		WebElement textarea=driver.findElement(By.xpath("//div[@class='row']//input[@type='text']"));
		Thread.sleep(3000);

		textarea.sendKeys("Welcome in Single Frame");
		Thread.sleep(3000);

		// Frame inside frame- nested iframes

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		WebElement outerframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);

		WebElement innerframe= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);

		System.out.println("In Nested Frame");
		WebElement textarea1=driver.findElement(By.xpath("//input[@type='text']"));

		Thread.sleep(3000);
		textarea1.sendKeys("Welcome in Nested Frame");
	}



}
