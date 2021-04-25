package jenkinsRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginValidation {
	public static RemoteWebDriver driver;
	
	@Test
	public void lauchApplication()
	{
	  WebDriverManager.chromedriver().setup(); 
	  driver=new ChromeDriver();
	  driver.get("https://login.salesforce.com");
	  driver.manage().window().maximize(); 
	  driver.manage().deleteAllCookies();
	  WebElement userName = driver.findElement(By.id("username"));
	  userName.sendKeys("cypress@testleaf.com");
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("Selbootcamp@123");
	  WebElement loginButton = driver.findElement(By.id("Login"));
	  loginButton.click();
	  System.out.println("Application launched successfully");
	 // driver.close();
	}

}
