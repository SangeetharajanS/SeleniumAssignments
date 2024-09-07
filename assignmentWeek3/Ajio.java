package assignmentWeek3;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		//Initialize driver
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//Launch URL
		driver.get("https://www.ajio.com/");
		//- In the search box, type as "bags" and press enter
		Thread.sleep(1000);
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		Thread.sleep(3000);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label [@for='Men']")).click();
		//Under "Category" click "Fashion Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(1000);
		// Print the count of the items found.
		String Count = driver.findElement(By.xpath("//div[contains(@aria-label, 'Items')]")).getText();
		System.out.println(Count +" Under Men-Fashion Bags");
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> Brand = driver.findElements(By.xpath("//div[@class='brand']"));
		for (WebElement brand:Brand) {
			System.out.println("Brand Names are: " + brand.getText());
		}
		//Get Bag Names
		List<WebElement> Bag = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement bag:Bag) {
			System.out.println("Bag Names are: " + bag.getText());
		}
	}
}
