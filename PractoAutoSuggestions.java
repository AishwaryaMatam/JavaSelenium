package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractoAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//"WAP for Autoggetion:		In Practo Search a Doctors name and click on one autosuggition "
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.practo.com/");
		WebElement search = driver.findElement(By.xpath("(//input[@class='c-omni-searchbox c-omni-searchbox--small'])[2]"));
		search.sendKeys("Hair");
		Thread.sleep(2000);
		List<WebElement> Suggestions = driver.findElements(By.xpath("(//div[@class='c-omni-suggestion-list']/div)[1]/div"));
		Thread.sleep(2000);
		int count = Suggestions.size();
		System.out.println(count);
		//(//div[@class='c-omni-suggestion-list'])/div/div
	}

}
