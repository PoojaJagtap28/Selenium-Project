package LaunchBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java");
		
		List<WebElement> list= driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
	
		System.out.println("No of Auto Suggstions: "+ list.size());
		
		for(WebElement ele:list) {
			if(ele.getText().contains("compiler")) {
				
				ele.click();
				break;
			}
			
		}

	}

}
