package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningAutomateMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Aishwarya");
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("Matam");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jspsasasasishwarya@gmail.com");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Aishwarysasa@123");
		WebElement Female = driver.findElement(By.id("Female"));
		Female.click();
		WebElement Skills = driver.findElement(By.id("Skills"));
		Select s = new Select(Skills);
		s.selectByValue("select1");
		WebElement technicalskills = driver.findElement(By.id("technicalskills"));
		Select s1 = new Select(technicalskills);
		s1.selectByValue("Selenium");
		WebElement Country = driver.findElement(By.id("Country"));
		Select s2 = new Select(Country);
		s2.selectByValue("India");
		WebElement Present_Address = driver.findElement(By.id("Present-Address"));
		Present_Address.sendKeys("Moursasya 20aa8, RV Avaneeewwendra APTS, Miyapur, Hyderaasasbad"+Keys.CONTROL+"a");
		Present_Address.sendKeys(Keys.CONTROL+"c");
		WebElement Permanent_Address = driver.findElement(By.id("Permanent-Address"));
		Permanent_Address.sendKeys(Keys.CONTROL+"v");
		WebElement Pincode = driver.findElement(By.id("Pincode"));
		Pincode.sendKeys("500049");
		WebElement file = driver.findElement(By.id("file"));
		file.sendKeys("C:\\Aishwarya\\Resume\\Aishwarya Matam QA Tester.docx");
		
		WebElement relocate = driver.findElement(By.xpath("(//input[@class= 'form-check-input'])[3]"));
		relocate.click();
		WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Submit.click();
		
		
		
		
		
	}

}
