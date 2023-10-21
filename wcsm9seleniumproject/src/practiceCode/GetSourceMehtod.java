package practiceCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceMehtod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nasa.gov/");
		Thread.sleep(2000);
		String LoginPageSource = driver.getPageSource();
		System.out.println(LoginPageSource);
		driver.close();
		
		
		
		
	}

}
