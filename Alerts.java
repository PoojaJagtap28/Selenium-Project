package LaunchBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// handle simple alert by clicking on OK button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		
		// handle confirmation alert by clicking on OK or Cancle button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		// handle prompt alert by providing input
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alert.sendKeys("Welcome");
		Thread.sleep(3000);
		System.out.println(alert.getText());
	    alert.accept();

	}

}
