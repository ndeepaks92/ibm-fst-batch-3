package Activity11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        driver.findElement(By.xpath("//button[@id='confirm']")).click();
                
        System.out.println("Alert text is - "+driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        driver.findElement(By.xpath("//button[@id='confirm']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        
        driver.close();

	}

}
