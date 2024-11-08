package newPavansir;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
 
driver.manage().window().maximize();
driver.get("https://testautomationpractice.blogspot.com");
WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='colors']"));
dropdownElement.click();
Select select = new Select(dropdownElement);
ArrayList olist = new ArrayList<>();
ArrayList tlist = new ArrayList<>();
List<WebElement> list = select.getOptions();
for(WebElement option :list) {
	olist.add(option.getText());
	tlist.add(option.getText());
}
System.out.println(olist);
System.out.println(tlist);
	System.out.println("After the Sorting");
Collections.sort(tlist);
System.out.println(olist);
System.out.println(tlist);
driver.quit();
	}
}
