
package Selenium_Pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class primera_prueba {

	public static void main (String[] args)throws
	InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C://selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3500);
		driver.findElement(By.cssSelector("div.a-section.glow-toaster input")).click();
		// div.a-section.glow-toaster input
		driver.findElement(By.cssSelector("div#nav-xshop a")).click();
		Thread.sleep(5000);
		driver.quit();
}
}