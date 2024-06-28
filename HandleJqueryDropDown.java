package LaunchBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleJqueryDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=  new EdgeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.findElement(By.id("justAnInputBox")).click();

		//selectcheckbox(driver,"choice 3");
		 selectcheckbox(driver,"choice 3","choice 2 3","choice 6");
		//selectcheckbox(driver,"all");

	}

	public static void selectcheckbox(WebDriver driver, String ...value ) {

		List<WebElement> choices= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println("No of choices: "+ choices.size());

		if(!value[0].equalsIgnoreCase("all")) {
			for (WebElement ch:choices) {
				String item=ch.getText();
				for(String val:value) {
					if(item.equalsIgnoreCase(val)) {
						ch.click();
						break;
					}

				}

			}			
		}
		else
		{
			try {
				for (WebElement ch:choices) {

					ch.click();
				}

			}
			catch(Exception e) {
			}
		}


	}	


		
	
	}


