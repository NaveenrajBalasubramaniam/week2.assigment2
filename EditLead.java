package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		username.sendKeys("demosalesmanager");
		password.sendKeys("crmsfa");
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']//following::input[2]")).sendKeys("NaveenRaj");
		String title = driver.getTitle();
		System.out.println(title);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("newleaf");
        driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
        String title1 = driver.getTitle();
		System.out.println(title1);
		String companyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Changed Company Name ="+ companyName);
		driver.close();

	}

}
