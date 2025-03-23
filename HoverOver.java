package basicselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement e1 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		e1.sendKeys("Shoes" +Keys.ENTER );
		WebElement e2 = driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"]"));
		e2.click();
		Set<String> pc = driver.getWindowHandles();
		System.out.println(pc);
		//Actions a = new Actions(driver);
		//a.moveToElement(e1).perform();	
		
	}

}
