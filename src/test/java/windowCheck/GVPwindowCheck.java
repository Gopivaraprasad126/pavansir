package windowCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GVPwindowCheck {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://facebook.com");
Thread.sleep(1000);
/*private By emailId = By.id("email");
private By password = By.id("pass");
private By signinbutton = By.name("login");*/		
System.out.println(driver.getTitle());
driver.findElement(By.id("email")).sendKeys("gopivaraprasad17@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Gopi@6966");
driver.findElement(By.name("login")).click();
Thread.sleep(1000);
System.out.println(driver.getTitle());
driver.close();
	}

}
