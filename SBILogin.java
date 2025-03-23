package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBILogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement login = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		login.click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
	
		int count = links.size();
		for(int i =0;i<count;i++)
		{
		//System.out.println(count);
		WebElement url = links.get(i);
		String link1= url.getAttribute("href");
		System.out.println("URL at index " +i+"is"+link1);
	}
	}

}
