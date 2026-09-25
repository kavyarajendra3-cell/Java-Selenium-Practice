package handlingCaptcha;

import java.io.File;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.Tesseract;

public class Captcha {

	public static void main(String[] args) throws Throwable {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification"); //To avoid Notification
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/nget/profile/user-signup");
		WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		Thread.sleep(2000);
		File temp = captcha.getScreenshotAs(OutputType.FILE);
		File per = new File("./CaptchaScreenShot/cap.png");
		FileHandler.copy(temp,per);
		
		Tesseract tess = new Tesseract();
		tess.setDatapath("C:\\Users\\Kavya Rajendran\\Downloads\\5.5.2 source code.zip\\tesseract-ocr-tesseract-9c516f4\\tessdata");
		String captext = tess.doOCR(per);
		String text = captext.replace(" ", "");
		System.out.println(text);
		WebElement cTF = driver.findElement(By.id(""));
		cTF.sendKeys("text");
	}
}
