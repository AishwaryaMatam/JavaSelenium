package basicselenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowandLinks{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoes" +Keys.ENTER);
		WebElement submit = driver.findElement(By.xpath("//button[@class='a-button-text']"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		for(int i =0;i<size;i++)
		{
			WebElement l = links.get(i);
			//System.out.println(l);
			String u = l.getDomAttribute("class");
			System.out.println("class------->>>"+u);
		}
		/*Set<String> pc = driver.getWindowHandles();
		Iterator<String> i = pc.iterator();
		String parentchild = i.next();
		String child = i.next();
		
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = suggestions.size();
		System.out.println(count);
		for(int i =0;i<count;i++)
		{
			WebElement link = suggestions.get(i);
			String url = link.getText();
			System.out.println("Print the string----------" +url);
		}*/
	}

}
