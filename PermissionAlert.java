package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PermissionAlert {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions options= new ChromeOptions();
     //	Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		
     	WebDriver driver=new ChromeDriver(options);

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();



		
		

	}

}
