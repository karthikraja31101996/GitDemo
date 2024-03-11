package Selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String>windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.get("https://www.rahulshettyacademy.com/");
		
		String text = driver.findElement(By.xpath("//a[text()='All-Access Membership-Complete Access to 25+ Courses (and counting!)']")).getText();
		
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(text);
		
		//Screenshot
		File ss= name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("name.png") );
		
		//Dimensions
		name.getRect().getDimension().getHeight();
		name.getRect().getDimension().getWidth();
	}

}
