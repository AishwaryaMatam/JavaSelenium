package basicselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {

	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(""+ Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		driver.quit();
	}
}
