package Lets_Go;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankWebSignin {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe"); 
		 
		  @SuppressWarnings("unused")
		WebDriver driver = new ChromeDriver(); 
		 // For ChromeBrowser 
		  
		  driver.get("https://www.bankofamerica.com/");
		  
		  driver.findElement(By.xpath("//*[@id=\"navChecking\"]/span[3]"));
		  
		  System.out.println("I clicked on the checking ...");
		  
		  Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
