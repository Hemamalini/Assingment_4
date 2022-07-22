package assingment4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdown {
public static void main(String[] args) {
	int count = 0;
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	
	WebElement dropDownElement1 = driver.findElement(By.id("dropdown1"));
	Select selOption1 = new Select(dropDownElement1);
	selOption1.selectByIndex(1);
	
	WebElement dropDownElement2 =driver.findElement(By.name("dropdown2"));
	Select selOption2 = new Select(dropDownElement2);
	selOption2.selectByVisibleText("Appium"); 
	
	WebElement dropDownElement3 =driver.findElement(By.id("dropdown3"));
	Select selOption3 = new Select(dropDownElement3);
	selOption3.selectByValue("3");
	
	
	WebElement dropDownElement4 =driver.findElement(By.className("dropdown"));
	Select selOption4 = new Select(dropDownElement4);
	List<WebElement> dropOptions = selOption4.getOptions();
	for (WebElement eachElemet : dropOptions) {
		count=count+1;
	}
	int totalCount=count-1;
	System.out.println("The number of dropdown Option is "+totalCount);
	
	WebElement dropDownElement5 = driver.findElement(By.xpath("(//select)[5]"));
	dropDownElement5.sendKeys("Loadrunner");
	
	WebElement dropDownElement6 = driver.findElement(By.xpath("(//select)[6]"));
	Select selOption5 = new Select(dropDownElement6);
	selOption5.selectByValue("3");

}
}
