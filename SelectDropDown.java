package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//driver.navigate().refresh();
		WebElement e = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Select s = new Select(e);
		s.selectByVisibleText("Amazon Pharmacy");
		
		

	}

}
