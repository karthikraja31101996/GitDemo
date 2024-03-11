import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1srvcxg'])[10]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1srvcxg'])[39]")).click();

	}

}
