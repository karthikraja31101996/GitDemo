import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //For sync
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("karthikraja");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		//System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
		
		driver.findElement(By.cssSelector("a._97w4")).click();
		driver.findElement(By.xpath("//a[@name ='reset_action']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("9094137890");
		driver.findElement(By.id("did_submit")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/form/div/div[3]/div/div[1]/button")).click();

	}

}
