package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//driver.findElement(By.id("u_0_0_ZX")).click();

driver.findElement(By.xpath("//a[@id='u_0_0_ZX']")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.id("u_9_b_Og")).sendKeys("Elavarasi");
driver.findElement(By.id("u_9_d_rG")).sendKeys("Rajamarthandan");
driver.findElement(By.id("u_9_g_Ge")).sendKeys("91919191");
driver.findElement(By.id("password_step_input")).sendKeys("Testeng@1");

WebElement Day = driver.findElement(By.name("birthday_day"));
Select SourceofDay=new Select(Day);
SourceofDay.selectByValue("26");

WebElement Month = driver.findElement(By.name("birthday_month"));
Select SourceofMonth=new Select(Month);
SourceofMonth.selectByValue("5");
	

WebElement Year = driver.findElement(By.name("birthday_year"));
Select SourceofYear=new Select(Year);
SourceofYear.selectByVisibleText("1988");
	
driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();

	}

}
