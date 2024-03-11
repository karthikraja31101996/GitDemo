import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {
		
		//chromedriver.exe --> Chrome Browser Invoke
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //Invoking browser(webdriver(interface) object creation)
		
		//To invoke firefox browser
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\91909\\Downloads\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//To Invoke Edge browser
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\91909\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.amazon.in");  //To run a website use get
		System.out.println(driver.getTitle()); //To get a title from current page tab
		System.out.println(driver.getCurrentUrl()); //To get the current URL of the page whether it is correct or not
		//driver.close(); //To close the current tab of the chrome
		//driver.quit(); //To close all the tabs of the chrome
		
		
	}

}
