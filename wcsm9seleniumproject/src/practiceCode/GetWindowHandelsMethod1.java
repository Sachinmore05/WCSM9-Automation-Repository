package practiceCode;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandelsMethod1 {
	public static void main(String[] args) throws InterruptedException {
		
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			Thread.sleep(2000);
			String parentHandle = driver.getWindowHandle();
			System.out.println("Address of Parent Window "+parentHandle);
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Open a popup window")).click();
			Set<String> AllWindow = driver.getWindowHandles();
			for(String Chrome:AllWindow)
			{
				if(parentHandle.equals(Chrome))
				{
					System.out.println("address of child window:"+Chrome);
				}
				else
				{
					System.out.println("address of parent window"+Chrome);
				}
				
				driver.quit();
				
				
				
			}
			
			
			
			
			
			
		
		
	}

}
