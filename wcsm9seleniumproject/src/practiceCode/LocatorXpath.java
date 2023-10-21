package practiceCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//Absoult Path 
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("shoes for men");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
		
		//Relative Path
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes for men nike");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//X path OR 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'or @name='field']")).sendKeys("shoes for men nike");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button'or @class='nav-input nav-progressive-attribute']")).click();
		
		

	}

}
