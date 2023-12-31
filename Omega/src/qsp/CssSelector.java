package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("span[role='button']")).click();
		driver.findElement(By.cssSelector("input[class='Pke_EE']")).sendKeys("shoes");
		driver.findElement(By.className("button[type='submit']")).click();
		driver.findElement(By.partialLinkText("Create ")).click();
		Thread.sleep(5000);
		driver.close();
	
       }
}
