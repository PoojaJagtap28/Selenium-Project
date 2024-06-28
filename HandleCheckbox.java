package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> days=driver.findElements(By.xpath("//div[@class='form-check form-check-inline']//input[contains(@id,'day')]"));
		int total=days.size();
		System.out.println("No of Checkboxes: "+ total);
		
		// selecting particular checkboxes
		
		for(WebElement d:days) {
			String dayname=d.getAttribute("id");
			if(dayname.equalsIgnoreCase("Monday") || dayname.equalsIgnoreCase("Friday")) {
				
				d.click();
			
			}
		
		}
		
		
//		                   selecting last 2 checkboxes
//		
//        for(int i=total-2;i<total;i++) {
//        	
//        	days.get(i).click();
//        }
		
//                        selecting first  2 checkboxes	
		
//	      for(int i=0;i<total;i++) {
//	    	if(i<2) {
//	    		
//	    		days.get(i).click();
//	    	}
//	    }
//		
//	   
	}
	
	

}
