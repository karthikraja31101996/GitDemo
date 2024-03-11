package Brushup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("admin");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		//driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
		
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("John");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
		
		
		
	

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		String text = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] splittedString = text.split("'");
		String[] split = splittedString[1].split("'");
		System.out.println(split[0]);
		return split[0];
	}

}
