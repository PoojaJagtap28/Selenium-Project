package LaunchBrowser;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamic_WebTable {

	public static void main(String[] args) throws InterruptedException {
		String fname = null,lname = null,email = null;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();

//		// deleting few more records in table
//
//
//		driver.findElement(By.xpath("//tr[2]//a[@title='delete']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//tr[4]//a[@title='delete']")).click();
//		Thread.sleep(3000);

		int rows=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr")).size();
		System.out.println("No Of Rows: "+ rows);

		int colunns=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//th")).size();
		System.out.println("No Of Columns: "+ colunns);

		// fetching specific columns data from dynamic table

		for(int r=1; r<rows; r++) {

			List<WebElement> data= driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr["+r+"]/td"));
			for(WebElement value:data) {

				//System.out.println("rowNo: "+ r + "  elements: " +data.size());   
				fname=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+r+"]/td[1]")).getText();
				lname=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+r+"]/td[2]")).getText();
				email=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+r+"]/td[4]")).getText();


			}


			System.out.println(fname + "     "+ lname +"         " + email );

		}

		
		
	}

}

