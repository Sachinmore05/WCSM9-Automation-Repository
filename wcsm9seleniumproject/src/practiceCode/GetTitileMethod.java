package practiceCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitileMethod {
public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.nasa.gov/");
			String PageName = driver.getTitle();
			System.out.println(PageName);
			driver.close();
			
			
			
}
}
