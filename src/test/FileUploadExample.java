package test;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
public class FileUploadExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			//System.setProperty("webdriver.firefox.driver","firefoxdriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.monsterindia.com/seeker/registration");
			
			driver.manage().window().maximize();  

			
			driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
			
			//WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
			
			//file.sendKeys("C:\\Users\\ptupili\\OneDrive - Cisco\\Desktop\\parser.txt");
			WebElement file = driver.findElement(By.xpath("//*[@class='upload-file']"));
	        file.click();
	  
	        // creating object of Robot class
	        Robot rb = new Robot();
	     
	        // copying File path to Clipboard
	        StringSelection str = new StringSelection("C:\\Users\\ptupili\\OneDrive - Cisco\\Desktop\\parser.txt");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	     
	         // press Contol+V for pasting
	         rb.keyPress(KeyEvent.VK_CONTROL);
	         rb.keyPress(KeyEvent.VK_V);
	     
	        // release Contol+V for pasting
	        rb.keyRelease(KeyEvent.VK_CONTROL);
	        rb.keyRelease(KeyEvent.VK_V);
	     
	        // for pressing and releasing Enter
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
