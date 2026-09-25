package shopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Kavya");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Rajendran");
		driver.findElement(By.xpath("//input[@id='Female']")).click();
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("kavyaram@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("KavyaRam@37");
		driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("KavyaRam@37");
		driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
		driver.findElement(By.xpath("//button[@id='btnDisabled']")).click();
		driver.close();
	}

}
