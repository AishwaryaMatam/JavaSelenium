package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/aishw/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		
		WebElement e1 = driver.findElement(By.name("username"));
		e1.sendKeys("Aishwarya" +Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		WebElement e2 = driver.findElement(By.name("say hello"));
		e2.sendKeys(Keys.CONTROL+"v");
		WebElement e3 = driver.findElement(By.linkText("Click to know about us"));
		e3.click();
		driver.get("https://grotechminds.com/automate-me/");
		WebElement e4 = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__overlay'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(e4).perform();
		
	}

}
