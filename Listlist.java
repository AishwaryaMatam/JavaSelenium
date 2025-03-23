package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listlist {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.partialLinkText(""));
		List<WebElement> e1=	driver.findElements(By.tagName("a"));
				
		int count=	e1.size();					
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
				WebElement link1=		e1.get(i);
				//String url=					link1.getAttribute("href");
				String url= link1.getDomAttribute("href");
			String 	text=				link1.getText();
					System.out.println("My URL at index position "+ i );
					System.out.println(url);
				System.out.println("My text at index position "+ i );
					System.out.println(text);
	}

	}

}
