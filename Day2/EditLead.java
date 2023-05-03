package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
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
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.xpath("//a[@href=\"/crmsfa/control/findLeads\"]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Elavarasi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ASK");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Coding Executed");
	}

}
