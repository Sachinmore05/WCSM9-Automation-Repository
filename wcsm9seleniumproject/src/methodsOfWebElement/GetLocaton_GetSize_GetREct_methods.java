package methodsOfWebElement;

import java.awt.Point;
import java.awt.SecondaryLoop;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocaton_GetSize_GetREct_methods {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demoapps.qspiders.com/");
		WebElement emailTextBox =driver.findElement(By.cssSelector("input#email"));
		org.openqa.selenium.Point Loc= emailTextBox.getLocation();
		
		
		
		
		
	}

}
