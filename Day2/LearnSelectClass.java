package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {
	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tessolve");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elavarasi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajamarthandan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ela");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Web Application Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anitharajamarthandan@gmail.com");
		
		//String title = driver.getTitle();
		//System.out.println(title);
	
	WebElement findElement3 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select source=new Select(findElement3);
	source.selectByIndex(4);
		
	WebElement findElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select marketsource=new Select(findElement);
	marketsource.selectByVisibleText("Automobile");
	
	WebElement findElement2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select ownershipelment=new Select(findElement2);
	ownershipelment.selectByValue("OWN_CCORP");
	
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
		
	}
}
