package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		
public class BootstrapDropdown {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@id='menu1']")).click();
		 List<WebElement> languages =driver.findElements(By.xpath("//ul[@class='dropdown-menu test']//a"));
		 System.out.println("No of Options: "+ languages.size());

		 for(WebElement ele:languages)
		 {
			 System.out.println(ele.getText());
			 if(ele.getText().equals("HTML")) {
				 
				 ele.click();
				 break;
			 }
		 }		

	}

}
