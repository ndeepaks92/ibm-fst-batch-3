package Activity12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
		
        System.out.println("Header of the first iframe is : "+driver.findElement(By.xpath("//div[@class='content']")).getText());
        
        driver.findElement(By.xpath("//button[@class='ui inverted red button']")).click();
        String buttontext = driver.findElement(By.xpath("//button[@class='ui inverted button blue']")).getText();
        String buttoncolor = driver.findElement(By.xpath("//button[@class='ui inverted button blue']")).getCssValue("color");
        System.out.println("Button text in the first iframe is : "+buttontext);
        System.out.println("Button Color in the first iframe is : "+buttoncolor);
        
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
        
        System.out.println("Header of the second iframe is : "+driver.findElement(By.xpath("//div[@class='content']")).getText());
        driver.findElement(By.xpath("//button[@class='ui inverted green button']")).click();
        String buttontext1 = driver.findElement(By.xpath("//button[@class='ui inverted button purple']")).getText();
        String buttoncolor1 = driver.findElement(By.xpath("//button[@class='ui inverted button purple']")).getCssValue("color");
        System.out.println("Button text in the second iframe is : "+buttontext1);
        System.out.println("Button Color in the second iframe is : "+buttoncolor1);
        
        driver.switchTo().parentFrame();
        
        driver.close();
        

        
	}

}
