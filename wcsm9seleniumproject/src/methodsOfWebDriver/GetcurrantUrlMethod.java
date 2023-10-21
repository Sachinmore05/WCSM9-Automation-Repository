package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrantUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=c6be3kqa6pg7h");
		
		
		String urlOfLoginPage=driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);
		Thread.sleep(2000);
		
		
	}

}
