package LaunchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersLaunch {

	public static void main(String[] args) {
		
		WebDriver driver;  
		System.out.println("Enter your choice of browser: ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("Chrome")) {
			System.out.println("Launching Chrome browser...");
			driver = new ChromeDriver();
			driver.get("https:\\\\google.co.in");
			driver.manage().window().maximize();
			driver.close();
				
		}
		
		else if(choice.equalsIgnoreCase("Edge")) {
			System.out.println("Launching Edge browser...");
			driver = new EdgeDriver();
			driver.get("https:\\\\google.co.in");
			driver.manage().window().maximize();
			driver.close();
				
		}
		
		else if (choice.equalsIgnoreCase("Firefox")) {
			System.out.println("Launching Firefox browser...");
			driver = new FirefoxDriver();
			driver.get("https:\\\\google.co.in");
			driver.manage().window().maximize();
			driver.close();
				
		}
		
		else{
			
			 System.out.println("Please enter any browser name from chrome, edge or firefox");
			
		}
		
		  

	}

}
