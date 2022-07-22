package assingment4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromiumdriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Link.html");
	
	//Go to Home Page
	driver.findElement(By.xpath("//a[@link=\"blue\"]")).click();
	driver.navigate().back();
	
	// Where am I suppose to go
	System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	
	//Verify am I broken?
	String brokeLink = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
	 URL obj1 = new URL(brokeLink); //URL Connection Created...  
     HttpURLConnection con1 = (HttpURLConnection) obj1.openConnection(); //Http URL Connection Created...  
     int r_code =con1.getResponseCode(); // it is use to get the status code from HTTP response message  
     //Checking Connection status code
	if(r_code==404) {
		  System.out.println("Connection Response Code : "+r_code+" The given "+brokeLink+" Link is broken");    
	}else {
		System.out.println("The given Link is not broken");
	}
	driver.findElement(By.linkText("Verify am I broken?")).click();
	driver.navigate().back();
   
	//Home page with same linkname
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.navigate().back();
	 
	//No of Link 
	System.out.println("The number of available link in this page : "+driver.findElements(By.xpath("//div[@class='row']")).size());
	
}
}
