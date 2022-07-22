package assingment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/radio.html");
	driver.manage().window().maximize();
	WebElement noElement = driver.findElement(By.id("yes"));
	noElement.click();
	driver.findElement(By.xpath("(//input[@name='news' and @value='0'])")).click();
	driver.findElement(By.xpath("//input[@class='myradio' and @value='2']")).click();
	}
}
