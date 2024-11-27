package AmezonMobileCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileCheck {

	public static void main(String[] args) {
		// Set the path to your ChromeDriver
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			// Open Amazon website
			driver.get("https://www.amazon.in");

			// Find the search box using the XPath and input the search term
			WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			searchBox.sendKeys("iphone 16 pro");
			// Submit the search
			searchBox.submit();
			// Add a small wait to allow the page to load results (you can use explicit
			// waits instead of sleep)
			Thread.sleep(3000); // Adjust if needed
			// Find the phone cost using the provided XPath
			WebElement phonePrice = driver.findElement(By.xpath("//span[.='1,59,900']"));
			// Output the price of the phone
			System.out.println("The cost of the phone is: " + phonePrice.getText());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
