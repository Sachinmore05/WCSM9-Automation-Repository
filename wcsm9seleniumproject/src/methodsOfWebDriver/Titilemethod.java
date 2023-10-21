package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titilemethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do;jsessionid=c6be3kqa6pg7h");
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		
		
		
	}

}
