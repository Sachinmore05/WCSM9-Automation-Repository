package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagIdLocator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Html/Login%20Page.html");
		Thread.sleep(2000);
		driver.findElement(By.id("id1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("id2")).sendKeys("manager");
		driver.close();
		
		
	
		
		
	}

}
