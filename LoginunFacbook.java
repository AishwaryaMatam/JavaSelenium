package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class LoginunFacbook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys("jspsaishwarya@gmail.com");
		WebElement e2 = driver.findElement(By.id("pass"));
		e2.sendKeys("password");
		WebElement e3 = driver.findElement(By.xpath("//button"));
		e3.click();
		//driver.quit();
		
	}
	
}
