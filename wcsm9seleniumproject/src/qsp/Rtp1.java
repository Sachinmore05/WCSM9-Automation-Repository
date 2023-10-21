package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp1 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Browser Value");
		String BrowserValue = sc.next();
		
		if (BrowserValue.equalsIgnoreCase("Chrome"))
		{
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
		}
		else if (BrowserValue.equalsIgnoreCase("FireFox"))
			{
			WebDriver driver = new FirefoxDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
			}
		else if (BrowserValue.equalsIgnoreCase("Edge"))
		   {
			WebDriver driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
			}
		else {
			System.out.println("invalid Data");
		}
			
		
	}

}
