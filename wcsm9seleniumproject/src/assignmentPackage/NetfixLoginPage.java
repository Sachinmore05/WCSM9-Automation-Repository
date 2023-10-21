package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetfixLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.netflix.com/in/login");
				driver.findElement(By.name("userLoginId")).sendKeys("rockt7566@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("password")).sendKeys("Amuu@2022");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
				//driver.findElement(By.className("btn login-button btn-submit btn-small")).click();			
		
	}

}
