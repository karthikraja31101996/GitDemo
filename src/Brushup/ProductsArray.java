package Brushup;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Apple" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		getItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		
		
	}
	public static void getItems(WebDriver driver, String[] itemsNeeded)
	{
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List<String> items = Arrays.asList(itemsNeeded);
			if (items.contains(formattedName)) 
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button ")).get(i).click();
			}
		}
	}
}
