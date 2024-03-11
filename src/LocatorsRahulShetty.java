import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRahulShetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Time for objects to appear on the page
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //Invoking Browser
		driver.findElement(By.id("inputUsername")).sendKeys("Karthik"); //By ID Locator
		driver.findElement(By.name("inputPassword")).sendKeys(password); //By Name Locator
		
		driver.findElement(By.className("signInBtn")).click(); //By Class name Locator
		driver.findElement(By.linkText("Forgot your password?")).click(); //By link Text Locator
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Karthik"); //By CSS Selector Tagname[attribute=’value’]
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("karthik123@gmail.com"); //By Xpath //Tagname[@attribute=’value’][index]
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890"); //Traversing from parent to child tag
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Karthik");
		
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		
		//driver.findElement(By.className("signInBtn")).click();
		
		//driver.findElement(By.cssSelector("input#chkboxOne")).click();
		
		
		
		

	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //Invoking Browser
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //By link Text Locator
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		String pwd = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] pwd1 = pwd.split("'");
		String password = pwd1[1].split("'")[0];
		return password;
		
		
		
		
	}
	
	

}
