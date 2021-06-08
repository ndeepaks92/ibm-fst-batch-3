package Activity11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/tab-opener");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        System.out.println("Handle of the page is : "+driver.getWindowHandles());
        driver.findElement(By.xpath("//a[@id='launcher']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        
        System.out.println("Handles of the pages are : "+driver.getWindowHandles());
        
        Set<String> handles = driver.getWindowHandles();
        
        for(String handle : handles) {
        	driver.switchTo().window(handle);
        }
        
        System.out.println("Title of the second tab is : "+driver.getTitle());
        System.out.println("Header in the second tab is : "+driver.findElement(By.xpath("//div[@class='content']")).getText());
        
        driver.findElement(By.xpath("//a[@id='actionButton']")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        
        System.out.println("New Handles of the pages are : "+driver.getWindowHandles());
        
        Set<String> handles2 = driver.getWindowHandles();
        
        for(String handle2 : handles2) {
        	driver.switchTo().window(handle2);
        }
        
        System.out.println("Title of the third tab is - "+driver.getTitle());
        
        System.out.println("Header in the third tab is : "+driver.findElement(By.xpath("//div[@class='content']")).getText());
        
        driver.close();
        
        
	}
}
