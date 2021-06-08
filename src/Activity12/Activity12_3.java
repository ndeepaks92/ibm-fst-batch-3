package Activity12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        Actions actions = new Actions(driver);
        
        actions.moveToElement(driver.findElement(By.xpath("//button[@class='ui huge inverted orange button']"))).build().perform();
        
        String tooltiptext = driver.findElement(By.xpath("//button[@data-tooltip='Click to sign in']")).getAttribute("data-tooltip");
        System.out.println("Tool tip text is : "+tooltiptext);
        
        driver.findElement(By.xpath("//button[@class='ui huge inverted orange button']")).click();
        
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
        
        System.out.println("Message displayed after logging in is : "+driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
        
        driver.close();
        
        
        
	}

}
