package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetfirstSelectetOption {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Html/MultiselectDropDown.html");
		WebElement dropDown1 = driver.findElement(By.id("idddd"));
		Select sel = new Select(dropDown1);
		Thread.sleep(2000);
		sel.selectByValue("v2");
		Thread.sleep(2000);
		WebElement firstOpt = sel.getFirstSelectedOption();
		System.out.println(firstOpt.getText());
		driver.navigate().to("file:///C:/Users/Admin/Desktop/Html/MultiselectDropDown.html");
		WebElement dropDown2 = driver.findElement(By.id("idddd"));
		Select Sel2 = new Select(dropDown2);
		 WebElement allops = sel.getWrappedElement();
		 System.out.println(allops.getText());
		 List<WebElement> options = sel.getOptions();
		 
		 for(WebElement opt:options)
		{
			Thread.sleep(2000);
			System.out.println(opt.getText());
		
			
		}
		
		}

		
	}
	
