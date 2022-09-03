package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    EdgeDriver driver = new EdgeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]/h5")).click();
		Point location = driver.findElement(By.xpath("(//label[contains(text(),' button (x,y)')])/following::button[1]")).getLocation();
		System.out.println(location);
		String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println(size);

	}

}
