package basicselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotClass {
	static WebDriver driver;
	public static void screenshot() throws IOException{
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\aishw\\eclipse-workspace\\SeleniumJava\\src\\basicselenium"+new TakeScreenShotClass().getClass()+Math.random()+".png");
		FileHandler.copy(source,destination);
	}

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		TakeScreenShotClass t = new TakeScreenShotClass();
		System.out.println(t.getClass());
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//TakeScreenShot Step 1
		screenshot();
		search.sendKeys("Shoes" +Keys.ENTER);
		WebElement submit = driver.findElement(By.xpath("//button[@class='a-button-text']"));
		screenshot();
		
		

	}

}
