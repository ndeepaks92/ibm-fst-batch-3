package Activity7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the page is "+driver.getTitle());
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Deepak");
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("password");
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/input[1]")).sendKeys("password");
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/input[1]")).sendKeys("test@ibm.com");
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
        
        WebElement message = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(message));
		
        System.out.println("Success message is "+message.getText());
        
        driver.close();

	}

}
