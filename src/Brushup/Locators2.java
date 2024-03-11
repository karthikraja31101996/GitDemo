package Brushup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Username
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Karthik");
		//Password
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		//Signin Button
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		String text = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray = text.split("'");
		
		String password = passwordArray[1].split("'")[0];
		
		return password;
	}

}
