package Activity6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Title of the page is "+driver.getTitle());
        driver.findElement(By.xpath("//button[@class= 'ui violet button']")).click();
        WebElement Hello = driver.findElement(By.xpath("//h1[contains(text(), 'HELLO!')]"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(Hello));
        System.out.println("Text displayed after clicking the Change content button is "+Hello.getText());
        
        WebElement late = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/h3[1]"));
        wait.until(ExpectedConditions.visibilityOf(late));
        
        System.out.println("Text displayed after hello is "+late.getText());
        
        driver.close();
        
        

	}

}
