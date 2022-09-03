package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]/h5")).click();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		System.out.println(title );
		driver.navigate().back();
		String attribute2 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		System.out.println(attribute2);
		String attribute6 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		System.out.println(attribute6);
		//condition same or no
		if(attribute2.equals(attribute6)) 
			System.out.println(" link are same");
		else
			System.out.println(" link are not same");
		driver.findElement(By.linkText("How many links are available in this page?")).click();
		driver.getCurrentUrl();
		String currentUrl =( "http://leafground.com/pages/Link.html");
		System.out.println(currentUrl);
	}	
}
