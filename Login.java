package LaunchBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) throws Exception {

		try {

			WebDriver driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.findElement(By.id("submit")).click();
            String msg= driver.findElement(By.className("post-title")).getText();
			if(msg.equalsIgnoreCase("Logged in successfully")) {

				System.out.println("Test case Passed");
			}
			
		   driver.findElement(By.linkText("Log out")).click();

		}
		catch(Exception e) {

			System.out.println("Test case Failed");

		}
		

	}

}
