package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleLaunchRightCLick {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement e1=		driver.findElement(By.linkText("Gmail"));
	
	Actions a1=new Actions(driver);
	a1.contextClick(e1).perform();
}
}
