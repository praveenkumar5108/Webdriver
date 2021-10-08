package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();  

		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		
		driver.switchTo().frame(0);
		
		WebElement dtp = driver.findElement(By.xpath("//input[@id='datepicker']"));
		
		//dtp.sendKeys("10/2/21");
		dtp.click();
		
		//WebElement month = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		//month.click();
		
	//	WebElement month1 = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
		//month1.click();
		
     WebElement date = driver.findElement(By.id("datepicker"));
        
        date.click();
        WebElement arrow = driver.findElement(By.xpath("//a[@title='Next']"));
        WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        
        String sMonth = month.getText();
        
        while(!sMonth.equals("December")) {
            
            arrow.click();
            arrow = driver.findElement(By.xpath("//a[@title='Next']"));
            month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            sMonth = month.getText();
        }
        
        WebElement day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='15']"));
        day.click();
		
	}

}
