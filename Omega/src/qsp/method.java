package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.instagram.com/");
		//navigate to instagram using get method webdriver
		Thread.sleep(5000);
		driver.close();
		
}

}
i