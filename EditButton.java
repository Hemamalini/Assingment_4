package assingment4;

import java.awt.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditButton {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("hema@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hemamalini");
		
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).clear();
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).sendKeys("Hema Text");
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println("The Given Field id enabled ? "+ enabled);
	}
}
