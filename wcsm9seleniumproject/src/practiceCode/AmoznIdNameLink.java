package practiceCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmoznIdNameLink {
	public static void main(String[] args) throws InterruptedException {
		
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for men");
				// WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
			//	searchbox.sendKeys("shoes for men");
				//driver.findElement(By.id("nav-search-submit-button")).click();
				
				
		
	}

}
