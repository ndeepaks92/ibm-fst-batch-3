package Activity4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity4_1 {

	public static void main(String[] args) {

    	System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of the page is - "+driver.getTitle());
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        System.out.println("Title of the new page is - "+driver.getTitle());
        driver.close();
	}

}
