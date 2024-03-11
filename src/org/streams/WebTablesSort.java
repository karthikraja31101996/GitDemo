package org.streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTablesSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture the webelements into a list
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture the text and store in a original list
		List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on original list--> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		List<String> price;
		//compare original and sorted
		Assert.assertEquals(originalList, sortedList);
		do
		{
		    List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		  price = rows.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getPrice(s)).collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}while(price.size()<1);
		
		
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String actPrice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return actPrice;
	}

}
