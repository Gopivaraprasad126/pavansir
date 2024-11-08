package newPavansir;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class DuplicateVDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://testautomationpractice.blogspot.com");
WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='colors']"));
dropdownElement.click();
Select select = new Select(dropdownElement);
Set<String> dup = new HashSet<>();
List<WebElement> options= select.getOptions(); 
boolean flag = false;
for(WebElement option:options) {
	String optiontext = option.getText();
	if(!dup.add(optiontext)) {
		flag = true;
	System.out.println("duplicate option found "+optiontext);
	
}
	
	}
if(!flag) {
	System.out.println("there is no duplicate values in List");
}
driver.quit();
	}
}
