package assingment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//Go to the Home page
		driver.findElement(By.id("home")).click();
		//Navigate back
		driver.navigate().back();
		//Get Position
		System.out.println("The Button coordinates of X and Y"+driver.findElement(By.id("position")).getLocation());
		
		//get background Color
		System.out.println("The Button Color is "+driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Get the Height and width of the button
		System.out.println("The Button Size "+driver.findElement(By.id("size")).getSize());
	}
}
