package com.mycompany.app.addressbook_selenium_ide;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Edureka\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	System.out.println("Welcome to the Demo for Selenium Chrome WebDriver.");
    	
    	driver.get("http://65.0.122.220:8888/");
    	
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	
    	driver.findElement(By.className("v-button")).click();
    	 driver.findElement(By.id("gwt-uid-5")).sendKeys("Devansh4Edureka2");
    	 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps2");
    	 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562701");
    	 driver.findElement(By.id("gwt-uid-11")).sendKeys("Devansh4Edureka2@edureka.co");
    	 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/11/2020");
    	 driver.findElement(By.className("v-button-primary")).click();
    	 //Thread.sleep(5000);
    	 //driver.quit();
    }
}
