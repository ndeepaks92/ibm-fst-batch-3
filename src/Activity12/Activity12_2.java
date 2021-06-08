package Activity12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
        System.out.println("Heading of the first nested iframe is : "+driver.findElement(By.xpath("//div[@class='content']")).getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
        System.out.println("Heading of the second nested iframe is : "+driver.findElement(By.xpath("//div[@class='content']")).getText());
        
        driver.close();
        
	}

}
