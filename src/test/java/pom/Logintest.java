package pom;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	
	WebDriver driv;
@BeforeClass
	void setup()
{
	WebDriverManager.chromedriver().setup();
driv = new ChromeDriver();
driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driv.manage().window().maximize();
	}
@Test
void testLogin() {
	LoginPage lp=new LoginPage(driv);
	lp.setUsername("admin");
	lp.setPassword("admin123");
	lp.clickLogin();
	Assert.assertEquals(driv.getTitle(),"OrangeHRM");
}

@AfterClass
void tearDown() {
	driv.quit();
}

//these are the new change from here to git hub purpouse

}
