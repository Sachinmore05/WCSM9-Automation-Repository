package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodClose {
public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://omayo.blogspot.com/");
			System.out.println(driver.getTitle());
			String name = driver.getTitle();
			System.out.println(name);
			driver.findElement(By.partialLinkText("Open a popup window")).click();
			Thread.sleep(2000);
			driver.quit();
			
			
	
	
}
}
