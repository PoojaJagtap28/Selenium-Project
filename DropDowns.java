package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		 WebElement date=driver.findElement(By.name("DateOfBirthDay"));
//		 Select datevalue=new Select(date);
//	     datevalue.selectByVisibleText("28");
    
         WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
//		 Select monthvalue=new Select(month);
//		 monthvalue.selectByVisibleText("March");
   
         WebElement year=driver.findElement(By.name("DateOfBirthYear"));
//		 Select yearvalue=new Select(year);
//		 yearvalue.selectByVisibleText("1999");
		 
		 selectDropdown(date,"28");
		 selectDropdown(month,"March");
		 selectDropdown(year,"1999");
	     
	}
	
	public static void selectDropdown(WebElement ele, String value) {
		
		  Select drp= new Select(ele);
		  List<WebElement> alloptions=drp.getOptions();
		  for(WebElement option: alloptions) {

			  if(option.getText().equals(value)) {
				  
				  option.click();
				  break;
			  }
		  }
	
		  	
	}

}
