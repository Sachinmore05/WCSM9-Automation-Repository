package practiceCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorNaykaa {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement serchbox=driver.findElement(By.name("search-suggestions-nykaa"));serchbox.sendKeys("makeup fixer");
		driver.findElement(By.name("search-suggestions-nykaa")).click();
		
		
		
	}

}
