package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();  

		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

		WebElement UserName = driver.findElement(By.xpath("//input[@id = 'email']"));
		
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Passwd = driver.findElement(By.xpath("//*[@name='pass']"));
		Passwd.sendKeys("abc123");
		
		WebElement login = driver.findElement(By.xpath("//button[text() = 'Log In']"));
		login.click();

		

	}

}
