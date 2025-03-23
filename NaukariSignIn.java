package basicselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariSignIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement register= driver.findElement(By.xpath("//a[.='Register']"));
		//register.click();
		
		WebElement google = driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		Set<String> pc = driver.getWindowHandles();		
		Iterator<String> i1= pc.iterator();
		String parentwindow = i1.next();
		String Childwindow = i1.next();
		driver.switchTo().window(Childwindow);
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("aishwaryamatam5@gmail.com");
		WebElement next = driver.findElement(By.xpath("//span[.='Next']"));
		next.click();
		//System.out.println(pc);
		//System.out.println(i1.next());
		//System.out.println(i1.next());
		
		
	
	
		
	}

}
