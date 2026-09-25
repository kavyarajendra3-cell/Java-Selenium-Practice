package switchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/selenium/web/iframes.html");
		Thread.sleep(2000);
	//	WebElement element = driver.findElement(By.xpath("//iframe[@name='iframe1-name']"));
		WebElement element = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("email")).sendKeys("Kavya");
	}

}
