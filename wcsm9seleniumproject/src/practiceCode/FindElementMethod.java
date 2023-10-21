package practiceCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nasa.gov/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Launches and Landings")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("OSIRIS-REx Earth Sample Return Landing")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
