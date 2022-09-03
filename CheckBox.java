package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    EdgeDriver driver = new EdgeDriver();
	    driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input[3]")).click();
		System.out.println("languages have selected");
		boolean selected = driver.findElement(By.xpath("(//div[@class='example'])[2]/input")).isSelected();
		System.out.println(" Selenium is checked is " +selected);
		boolean select=driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).isSelected();
		if(select){
			driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
		}
		System.out.println("Deselected the selected");
		for (int i = 1; i <=6; i++) {
			driver.findElement(By.xpath(("//label[text()='Select all below checkboxes ']/following-sibling::input["+i+"]"))).click();
         }	
        System.out.println("All boxes selected");
        driver.close();
		WebElement option5= driver.findElement(By.xpath("(//input[@type='checkbox'])[13]"));
		option5.click();
		System.out.println(option5);
		WebElement option6= driver.findElement(By.xpath("(//input[@type='checkbox'])[14]"));
		option6.click();
		System.out.println(option6);

	}

}
