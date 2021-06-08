package Activity5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity5_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is "+driver.getTitle());
        Boolean checkbox = driver.findElement(By.xpath("//input[@class = 'willDisappear']")).isDisplayed();
        System.out.println("Dynamic checkbox is present - "+checkbox);
        driver.findElement(By.xpath("//button[@id= 'toggleCheckbox']")).click();
        System.out.println("Dynamic checkbox is present - "+checkbox);
        
        driver.close();
	}

}
