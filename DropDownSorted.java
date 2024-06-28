package LaunchBrowser;


import java.lang.classfile.WritableElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSorted {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement drpele= driver.findElement(By.name("category_id"));
		
		Select ele=new Select(drpele);
	    List<WebElement> list =ele.getOptions();
		
		ArrayList orgList=new ArrayList();
		ArrayList tempList=new ArrayList();
		

       Thread.sleep(1000);
		for(WebElement opt:list) {
            orgList.add(opt.getText());
			tempList.add(opt.getText());
			
		}
		System.out.println("Original List: "+ orgList);
		System.out.println("Before Sorting Temporary List: "+ tempList);
		
		Collections.sort(tempList);
		System.out.println("*************************************************************************************");
		System.out.println("Original List: "+ orgList);
		System.out.println("After Sorting Temporary List: "+ tempList);
		
		System.out.println("*************************************************************************************");
		
		if(orgList.equals(tempList)) {
			System.out.println("List is Sorted");
			
		}

		else {
			System.out.println("List is unsorted");
		}
	}

}
