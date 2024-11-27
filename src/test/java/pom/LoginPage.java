package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
//constructor(for intiating the webdriver)
LoginPage(WebDriver driver){
	this.driver = driver;
}
//Locators
By  txt_u_l =By.xpath("//input[@placeholder='Username']");
By  txt_p_l =By.xpath("//input[@placeholder='Password']");
By  txt_l_l =By.xpath("//button[@type='submit']");

//Actions
public void setUsername(String username) {
	driver.findElement(txt_u_l).sendKeys(username);
}
public void setPassword(String pwd) {
	driver.findElement(txt_p_l).sendKeys(pwd);
}
public void clickLogin() {
	driver.findElement(txt_l_l).click();
}

}
