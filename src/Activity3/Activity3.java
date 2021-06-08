package Activity3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity3 {
	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page is - "+driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Deepak");
        driver.findElement(By.id("lastName")).sendKeys("Test");
        driver.findElement(By.id("email")).sendKeys("Deepaktest@ibm.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("input.ui.green.button")).click();
        //driver.findElement(By.cssSelector("input[type=submit]")).click();
        
        Thread.sleep(4000);
        
        driver.close();

	}

}
