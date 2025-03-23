package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onemg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1mg.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(int i = 0;i<links.size();i++)
		{
			WebElement link1 = links.get(i);
			String url= link1.getDomAttribute("href");
			System.out.println("URL at index " +i +"is------>" +url);
			String 	text=				link1.getText();
			System.out.println("Text at index " +i +"is------>" +text);
		}
		WebElement search = driver.findElement(By.className("styles__search-input___3I6VS"));
		search.sendKeys("plum");//+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> Suggestions = driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		int count = Suggestions.size();
		System.out.println(count);
		
	}

}
