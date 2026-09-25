package shopperStack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class ShopperStackPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\ShopperStackNotes.txt");
		Properties prop = new Properties();
		prop.load(fis);
		
		String BROWSER = prop.getProperty("Browser");
		String URL = prop.getProperty("url");
		String FIRSTNAME = prop.getProperty("First Name");
		String LASTNAME = prop.getProperty("Last Name");
		String PHNO = prop.getProperty("Phone Number");	
		String MAIL = prop.getProperty("Email");
		String PSW = prop.getProperty("Password");
		String CPSW = prop.getProperty("Confirm Password");
		
		WebDriver driver = null;
		
		if (BROWSER.equalsIgnoreCase ("Chrome")) {
			driver = new ChromeDriver();
		} 
		else if (BROWSER.equalsIgnoreCase ("Edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
	driver.manage().window().maximize();
	driver.get(URL);
	driver.findElement(By.id("First Name")).sendKeys(FIRSTNAME);
	}
}
