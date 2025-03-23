package basicselenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipKart {

	public static void main(String[] args) throws IOException {
		FlipKart f= new FlipKart();
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class ='Pke_EE']"));
		search.sendKeys("Shoes");
		Date date=new Date();
		System.out.println(date);
		String day = date.toString().substring(0, 3);
		String month = date.toString().substring(4,10);
		String time = date.toString().substring(11, 19);
		String timestamp = day+month+time;
		System.out.println(timestamp);
		//String timestamp = System.out.println(day+month+time);
		//String timestamp = date.toString().replace(":", "_").replace(" ", "_");
		//System.out.println(timestamp);
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\aishw\\eclipse-workspace\\SeleniumJava\\src\\basicselenium"+new FlipKart().getClass()+".png");
		FileHandler.copy(source, destination);
	}

}
