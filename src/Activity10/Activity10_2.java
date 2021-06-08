package Activity10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        Actions builder = new Actions(driver);
        
        builder.sendKeys("D").build().perform();
        builder.keyDown(Keys.CONTROL).build().perform();
        builder.sendKeys("A").build().perform();
        builder.sendKeys("C").build().perform();
        builder.keyUp(Keys.CONTROL);
        
        System.out.println("Pressed key is :"+driver.findElement(By.xpath("//div[@id='keyPressed']")).getText());
        
        driver.close();
        

	}

}
