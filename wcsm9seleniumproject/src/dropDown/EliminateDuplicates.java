package dropDown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	public static void main(String[] args) {
		
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///C:/Users/Admin/Desktop/Html/MultiselectDropDown.html");
			WebElement menuDropDown = driver.findElement(By.id("idddd"));
			Select sel = new Select(menuDropDown);
			List<WebElement> allops = sel.getAllSelectedOptions();
			HashSet<String> hs = new HashSet<String>();
			for(int i=0;i<allops.size();i++)
			{
			WebElement op = allops.get(i);
			
			
			}
			
	

	}

}
