package assignmentsWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBUserCreation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Sangeeth");
		driver.findElement(By.name("lastname")).sendKeys("Sandy");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567891");
		driver.findElement(By.id("password_step_input")).sendKeys("Pwd@123");
		WebElement Day = driver.findElement(By.id("day"));
		Select Dayobj = new Select(Day);
		Dayobj.selectByIndex(4);
		WebElement Month = driver.findElement(By.id("month"));
		Select Monthobj = new Select(Month);
		Monthobj.selectByValue("1");
		WebElement Year = driver.findElement(By.id("year"));
		Select Yearobj = new Select(Year);
		Yearobj.selectByVisibleText("1998");
		WebElement Gender = driver.findElement(By.xpath("(//input[@value='2'])"));
		Gender.click();
		
	}
}
