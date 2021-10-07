package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id = 'alertButton']"));
		button1.click();
		
		Alert alt= driver.switchTo().alert();
		alt.accept();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@id = 'confirmButton']"));
		button1.click();
		Alert alt1= driver.switchTo().alert();
		alt.dismiss();
		
		WebElement but1 = driver.findElement(By.xpath("//button[@id = 'promtButton']"));
		but1.click();
		Alert alt2= driver.switchTo().alert();
		alt2.sendKeys("praveen");
		Thread.sleep(4000);
		alt.accept();

		
		
		
	
	}

}
