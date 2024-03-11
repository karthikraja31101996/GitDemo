package Brushup;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AssignmentE2EAfterExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		String[] itemsNeeded = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
		
		
		//driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		
		for(int i=0; i<products.size(); i++)
		{
			String name = products.get(i).getText();
			
			List<String> itemsAddtoCart = Arrays.asList(itemsNeeded);
			if(itemsAddtoCart.contains(name))
			{
				driver.findElements(By.xpath("(//button[@class='btn btn-info'])")).get(i).click();
			}
		}
		
		
		driver.findElement(By.cssSelector("a.btn-primary")).click();
		
		driver.findElement(By.cssSelector("button.btn-success")).click();
		
		//driver.findElement(By.cssSelector("input#country")).sendKeys("India");
		
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}
