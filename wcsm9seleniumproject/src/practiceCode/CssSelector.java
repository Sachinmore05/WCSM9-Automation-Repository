package practiceCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) {
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/login/");
				//Tag & Id 
				// driver.findElement(By.cssSelector("#email")).sendKeys("Sachinkumar");
				//driver.findElement(By.cssSelector("input#email")).sendKeys("Sachinkumar");
				
				// tag & Class 
				//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Amuu");
				//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Amuu");
				
				 // tag & attribute 
				//driver.findElement(By.cssSelector("[id=email]")).sendKeys("Sachin");
				//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Sachin");
				
				// tag, class & Attribute 
				 driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("sachin");
				 driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("1234");
				 
				 
				
			
				
					
				
				
		
	}

}
