package methodsOfWebElement;

import java.util.Scanner;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amzon1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Pass the browsername Which us want to launch");
		String browserValue = sc.next();
		FirefoxDriver driver;
		if (browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
			
		
				
				
		
	}
}
