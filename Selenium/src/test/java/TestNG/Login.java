package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Utkarsh@123");
		driver.findElement(By.id("pass")).sendKeys("hello@123");
		driver.findElement(By.name("login")).click();
}


@BeforeMethod
public void beforeMethod() {
	// set path of Chromedriver executable
    System.setProperty("webdriver.chrome.driver",
    		"C:\\Users\\Utkarsh\\Downloads\\chromedriver_win32\\chromedriver.exe");

    // initialize new WebDriver session
    driver = new ChromeDriver();
}

@AfterMethod
public void afterMethod() {
	// close and quit the browser
	  String actualUrl = "https://www.facebook.com/";
		String expectedUrl = driver.getCurrentUrl();
	System.out.println("there was some error Either user name or password Wrong");
		Assert.assertEquals(expectedUrl, actualUrl);
		
    
}
  }
  
 