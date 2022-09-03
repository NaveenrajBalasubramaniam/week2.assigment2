package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();
	    EdgeDriver driver = new EdgeDriver();
	    driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Index = driver.findElement(By.xpath("//select[@id='dropdown1']"));
	    Select dropdown1=new Select(Index);
	    dropdown1.selectByIndex(1);
	    WebElement Text = driver.findElement(By.xpath("//select[@name='dropdown2']"));
	    Select dropdown2=new Select(Text);
	    dropdown2.selectByVisibleText("Selenium");
	    WebElement value = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select dropdown3 = new Select(value);
		dropdown3.selectByValue("1");
	    WebElement options = driver.findElement(By.xpath("//select[@class='dropdown']"));
	    Select Size=new Select(options);
	    List<WebElement>List=Size.getOptions();
	    System.out.println(List.size());
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select")).sendKeys("Selenium");
	    Select dropdown5 = new Select(driver.findElement(By.xpath("//div[@class='example'])[6]/select")));
	    if(dropdown5.isMultiple()) {
	    dropdown5.selectByIndex(1);
	    dropdown5.selectByIndex(2);
	    dropdown5.selectByVisibleText("UFT/QTP");
	    }
	}

}
