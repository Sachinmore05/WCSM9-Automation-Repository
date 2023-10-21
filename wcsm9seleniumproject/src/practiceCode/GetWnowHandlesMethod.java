package practiceCode;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWnowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parentHandle = Driver.getWindowHandle();
		System.out.println("parent handle id: " + parentHandle);
		
	
		Driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Set<String> AllHandle = Driver.getWindowHandles();
		
	 for (String wh : AllHandle)
	 {
		 if(!parentHandle.equals(wh))
		 {
			 System.out.println("child handle :"+ wh);
		 }
		 else 
		 {
			 System.out.println("parent handle :"+ wh);
		 }
	 }
	 
	 Driver.quit();
		
		
		
		
		
		
		

		
	}

}
