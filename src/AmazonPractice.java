import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.id("ap_email")).sendKeys("karthikraja31101996@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Karthik@1996");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("footwear for men");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class='s-suggestion s-suggestion-ellipsis-direction']")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).click();

	}

}
