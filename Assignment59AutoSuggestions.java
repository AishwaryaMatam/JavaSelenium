package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment59AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Write a  program to open a Google and type anything and navigate to auto suggestions using the down arrow keys and enter.
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//WebElement e1 = driver.findElement(By.id("APjFqb"));
		WebElement e1 = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		e1.sendKeys("Apple");
		Thread.sleep(1000);
		List<WebElement> Suggestion =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		Thread.sleep(1000);
		int count = Suggestion.size();
		System.out.println(count);
		
		
	

	}

}
