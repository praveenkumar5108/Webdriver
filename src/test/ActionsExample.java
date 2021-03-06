package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
      driver.get("http://demo.guru99.com/test/drag_drop.html");					
      
		//Element which needs to drag.    		
      	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
       
       //Element on which need to drop.		
       WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
       		
       //Using Action class for drag and drop.		
       Actions act=new Actions(driver);					

	//Dragged and dropped.		
       act.dragAndDrop(From, To).build().perform();	
       
       act.sendKeys(Keys.PAGE_DOWN);
     
       
	}		
}