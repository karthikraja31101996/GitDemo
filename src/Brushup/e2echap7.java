package Brushup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2echap7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Launching the website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Autosuggestive dropdowns
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		//Wait mechanism
		Thread.sleep(2000);
		//Taking generic locator to select all options
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//For loop to iterate through the options
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
		//Dynamic Dropdowns
		//clicking the origin station 
		driver.findElement(By.cssSelector("input[id*='originStation1']")).click();
		//clicking the station
		driver.findElement(By.cssSelector("a[value='JLR']")).click();
		driver.findElement(By.xpath("(//a[@value='PAT'])[2]")).click();
		
		//Handling calendars
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
		
		//Return date enabling
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			Assert.assertTrue(true);
		}
		//Passengers count
		driver.findElement(By.id("divpaxinfo")).click();
		int i=1;
		while(i<=5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		
		//Static dropdowns
		WebElement dropdown = driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
		
		Select dropdownlist = new Select(dropdown);
		dropdownlist.selectByVisibleText("AED");
		
		//clicking check boxes
		driver.findElement(By.name("ctl00$mainContent$chk_StudentDiscount")).click();
		
		Thread.sleep(2000);
		
		//clicking on search button
		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
		
	}

}
