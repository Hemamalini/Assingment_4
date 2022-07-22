package assingment4;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	
	//Select Lang 
	driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[1]")).click();
	driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[3]")).click();
	
	//Selenium Checked
	boolean CheckBoxsel = driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[6]")).isSelected();
	System.out.println("The Give CheckBox is Selected : "+CheckBoxsel);
	
	////Selenium Deselect
	boolean CheckBoxUnsel = driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[8]")).isSelected();
	if(CheckBoxUnsel==true) {
		driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[8]")).click();
	}else
		System.out.println("The clicked checkbox is Unselected");
	
	//Click all Option
	for(int i=9;i<=14;i++) {
		driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)["+i+"]")).click();
	
	}
}
}
