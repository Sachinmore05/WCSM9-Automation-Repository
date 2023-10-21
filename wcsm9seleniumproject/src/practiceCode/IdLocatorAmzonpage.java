package practiceCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorAmzonpage {
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement serchbox=driver.findElement(By.id("twotabsearchtextbox"));serchbox.sendKeys("shoes for men");
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.linkText("Mobiles")).click();
			
			
		
	}

}
