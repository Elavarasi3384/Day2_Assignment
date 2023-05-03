package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	    driver.findElement(By.xpath("//span[@id='u_9_o_g2']")).click();
	
	
	
	}

}
