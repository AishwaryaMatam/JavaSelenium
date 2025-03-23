package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Apple");
		Thread.sleep(1000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//div[@class = 'two-pane-results-container']/div/div"));
		int count = suggestion.size();
		System.out.println(count);
		
	//	(//div[@id='nav-flyout-searchAjax']/div/div/div/div)
		//div[@class = 'nav-issFlyout nav-flyout']/div/div/div/div
		

	}

}
