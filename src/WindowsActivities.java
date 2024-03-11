import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //To Maximize the chrome window
		
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.rahulshettyacademy.com");
		
		driver.navigate().back(); //To navigate back (moves to google)
		driver.navigate().forward(); //To Navigate forward (Moves to Rahul shetty)

	}

}
