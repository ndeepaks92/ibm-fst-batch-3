package Activity6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity6_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is "+driver.getTitle());
        driver.findElement(By.xpath("//button[@id= 'toggleCheckbox']")).click();
        WebElement Dynamiccheckbox = driver.findElement(By.xpath("//input[@class= 'willDisappear']"));
        
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOf(Dynamiccheckbox));
        
        driver.findElement(By.xpath("//button[@id= 'toggleCheckbox']")).click();
        wait.until(ExpectedConditions.visibilityOf(Dynamiccheckbox));
        
        Dynamiccheckbox.click();
        
        driver.close();
		

	}

}
