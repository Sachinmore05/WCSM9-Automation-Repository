package practiceCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrantMtheod {
public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.nasa.gov/");
			Thread.sleep(2000);
			String LoginPage = driver.getCurrentUrl();
			System.out.println(LoginPage);
			driver.close();
			
			
			
	
}
}
