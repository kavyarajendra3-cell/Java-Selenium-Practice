package newbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Start1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.shoppersstack.com/");
		driver.get("");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.name("Email")).sendKeys("kavyarajendra3@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("kavyanikki");
		WebElement btn=driver.findElement(By.className("//span[@class='MuiButton-label']"));
		Actions act = new Actions(driver);
		act.moveToElement(btn).click().perform();
		}
}
