package assingment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Update {
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
		WebElement smallEditElement = driver.findElement(By.className("subMenuButton"));
		smallEditElement.click();
		WebElement newcompanyNameFormElement = driver.findElement(By.id("createLeadForm_companyName"));
		newcompanyNameFormElement.clear();
		newcompanyNameFormElement.sendKeys("Zoho");
		WebElement newfirstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
		newfirstNameElement.clear();
		newfirstNameElement.sendKeys("Malini");
		WebElement newsmallSubmitElement = driver.findElement(By.className("smallSubmit"));
		newsmallSubmitElement.click();
		String createTitlePage = driver.getTitle();
		System.out.println("The Title of the page is : "+createTitlePage);
	}
}	
