package basicselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement prime = driver.findElement(By.xpath("//a[@id = 'nav-link-amazonprime']"));
		Actions a = new Actions(driver);
		a.moveToElement(prime).perform();
		
	}

}
