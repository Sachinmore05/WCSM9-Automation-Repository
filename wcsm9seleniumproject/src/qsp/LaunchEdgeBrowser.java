package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().minimize();
	Thread.sleep(4000);
	driver.manage().window().maximize();
	System.out.println("Edge is Open");
	Thread.sleep(4000);
	driver.close();
	System.out.println("Edge is Colse");
	
	
	
}
}
