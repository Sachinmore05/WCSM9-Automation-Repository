package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-rsulvm8/login.do");
		WebElement checkbutton = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		checkbutton.click();
		if(checkbutton.isSelected())
		{
			System.out.println("Display Status is true");
		}
		else
		{
			System.out.println("Display Status is False");
		}
		

	}

}
