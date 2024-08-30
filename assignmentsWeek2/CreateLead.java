package assignmentsWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	    public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BCCI");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhoni");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Head Coach");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String Title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println("Title is "+Title);
		driver.quit();
	}

}
