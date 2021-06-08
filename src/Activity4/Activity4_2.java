package Activity4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Activity4_2 {
	
	public static void main(String[] args) {

    	System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of the page is - "+driver.getTitle());
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Deepak");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Deepaktest@ibm.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9801234761");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.close();
	}

}
