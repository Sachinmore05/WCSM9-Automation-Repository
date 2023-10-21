package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		String loginPageSourceCode = driver.getPageSource();
		System.out.println(loginPageSourceCode);
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
