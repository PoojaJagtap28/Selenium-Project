package LaunchBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("No of rows: "+ rows);
		
		int cols=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("No of columns: "+ cols);
		
		
		for(int i=2;i<=rows;i++) {
			
			for(int j=1;j<=cols;j++)
			{
				String element=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
		        System.out.print(element + "           ");
				}
			
			  System.out.println();
			}	

			
		}

	}


