package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();  
		
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click(); 
		
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Kas@12232");
		
		WebElement LoginButtton = driver.findElement(By.name("btn_login"));
		LoginButtton.click();
		
		//WebElement ForgotPassword = driver.findElement(By.linkText("Forgot Password?"));		
		//ForgotPassword.click();
		
		WebElement RemPa = driver.findElement(By.className("rememberMe"));
		RemPa.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
