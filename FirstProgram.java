package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirstProgram {
public static void main(String[] args) {
	
	
	//System.setProperty("webdriver.gecko.driver", "E:\\chromedriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	
	driver.findElement(By.cssSelector(".button")).click();
	
	driver.close();
	
	
}
}
