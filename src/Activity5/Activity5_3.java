package Activity5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity5_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is "+driver.getTitle());
        Boolean TextEnabled = driver.findElement(By.xpath("//input[@id= 'input-text']")).isEnabled();
        System.out.println("Is the text box enabled? - "+TextEnabled);
        driver.findElement(By.xpath("//button[@id= 'toggleInput']")).click();
        Boolean TextEnabled1 = driver.findElement(By.xpath("//div[@id= 'dynamicText']")).isEnabled();
        System.out.println("Is the text box enabled? - "+TextEnabled1);
        
        driver.close();
        

	}

}
