package assingment4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromiumdriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Image.html");
	
	//Click Image to go to homepage
	driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
	driver.navigate().back();
	//http://www.leafground.com/images/abcd.jpg
	String BrokeImg = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
	URL objUrl = new URL(BrokeImg);
	HttpURLConnection objConnect = (HttpURLConnection) objUrl.openConnection(); 
	int statusCode =objConnect.getResponseCode(); 
	if(statusCode==404) {
		  System.out.println("Image is broken");    
	}else {
		System.out.println("Image is not broken");
	}
	//Mouse click
	driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	driver.navigate().back();
}
}
