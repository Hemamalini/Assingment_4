package assingment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userElement = driver.findElement(By.id("username"));
		userElement.sendKeys("Demosalesmanager");
		WebElement nameElement = driver.findElement(By.id("password"));
		nameElement.sendKeys("crmsfa");
		WebElement submitElement = driver.findElement(By.className("decorativeSubmit"));
		submitElement.click();
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		WebElement leadElement = driver.findElement(By.linkText("Leads"));
		leadElement.click();
		WebElement createLeadElement = driver.findElement(By.linkText("Create Lead"));
		createLeadElement.click();
		WebElement companyNameFormElement = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameFormElement.sendKeys("Amazon");
		WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameElement.sendKeys("Hemamalini");
		WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameElement.sendKeys("Chandrasekaran");
		WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocalElement.sendKeys("Hema");
		WebElement departmentNameLocalElement = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentNameLocalElement.sendKeys("BM");
		WebElement descriptionLocalElement = driver.findElement(By.id("createLeadForm_description"));
		descriptionLocalElement.sendKeys("BM LOCATED IN CHENNAI");
		WebElement primaryEmailLocalElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmailLocalElement.sendKeys("hema@gmail.com");
		WebElement StateProvinceGeoIdElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		//StateProvinceGeoIdElement.sendKeys("New York");//or try by creating obj
		Select stateObj = new Select(StateProvinceGeoIdElement);
		stateObj.selectByVisibleText("New York");
		WebElement smallSubmitElement = driver.findElement(By.className("smallSubmit"));
		smallSubmitElement.click();
		String createTitlePage = driver.getTitle();
		System.out.println("The Title of the page is : "+createTitlePage);
	}
}









/*1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator
3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on Create Lead 
7. Enter CompanyName Field Using id Locator
8. Enter FirstName Field Using id Locator
9. Enter LastName Field Using id Locator
10. Enter FirstName(Local) Field Using id Locator
11. Enter Department Field Using any Locator of Your Choice
12. Enter Description Field Using any Locator of your choice 
13. Enter your email in the E-mail address Field using the locator of your choice
14. Select State/Province as NewYork Using Visible Text
15. Click on Create Button
 16. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/