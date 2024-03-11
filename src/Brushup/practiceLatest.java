package Brushup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceLatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com");
			
			driver.switchTo().alert().dismiss();
			
	}

}
