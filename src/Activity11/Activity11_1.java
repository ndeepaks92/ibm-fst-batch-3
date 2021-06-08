package Activity11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        driver.findElement(By.xpath("//button[@id='simple']")).click();
        String AlertText = driver.switchTo().alert().getText();
        System.out.println("Alert text is - "+AlertText);
        
        driver.switchTo().alert().accept();
        
        driver.close();
        
	}

}
