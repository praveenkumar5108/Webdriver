package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();  

		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
        WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
		
		LoginLink.click(); 

		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Kas@12232");
		
		WebElement LoginButtton = driver.findElement(By.name("btn_login"));
		LoginButtton.click();
		
		//WebElement ForgotPassword = driver.findElement(By.linkText("Forgot Password?"));		
		//ForgotPassword.click();
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String actualMsg = Error.getText();
		
		String expectedMsg = "The email or password you have entered is invalid.";
		
		if(actualMsg.equals(expectedMsg)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
        
		System.out.println("total links are:" + Links.size());

		for(WebElement data: Links) {
			System.out.println(data.getText());
		}
		
		
		for(WebElement dest: Links) {
			System.out.println(dest.getAttribute("href"));
		}	
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement RemPa = driver.findElement(By.className("rememberMe"));
		RemPa.click();
		
		Thread.sleep(5000);
		
		//driver.quit();
		
	}

}
