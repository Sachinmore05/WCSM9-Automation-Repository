package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFriefoxBroser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	System.out.println("browser is open");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	System.out.println("browser is close");
	
	
}
}
