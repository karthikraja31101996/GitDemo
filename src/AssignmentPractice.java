import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='name']:nth-child(2)")).sendKeys("Karthik");
		
		driver.findElement(By.name("email")).sendKeys("karthikraja31101996@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Karthik");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement options = driver.findElement(By.id("exampleFormControlSelect1"));
		Select option = new Select(options);
		
		option.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("12-12-1996");
		
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		
		
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert']")).getText());
		
		
		
	}

}
