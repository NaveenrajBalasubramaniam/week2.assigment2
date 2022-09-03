package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    EdgeDriver driver = new EdgeDriver();
	    driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("naveenraj@gmail.com");		
		driver.findElement(By.xpath("//label[contains(text(),'Append')]/following::input")).sendKeys("NAVE,keys.TAP");
		String text = driver.findElement(By.xpath("//label[contains(text(),'Get default')]")).getText();
        System.out.println(text);
        String attribute = driver.findElement(By.name("username")).getAttribute("value");
        System.out.println(attribute);
        driver.findElement(By.xpath("//label[contains(text(),'Clear')]/following::input")).clear();
        boolean displayed = driver.findElement(By.xpath("//label[contains(text(),'Confirm')]/following::input")).isDisplayed();
        System.out.println(displayed);

	}

}
