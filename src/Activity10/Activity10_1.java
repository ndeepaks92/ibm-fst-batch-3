package Activity10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        Actions builder = new Actions(driver);
       
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
	
        builder.click(cube);
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());
	
        builder.doubleClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal.getText());
	
        builder.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));	
        System.out.println("Right Click: " + cubeVal.getText());

        driver.close();

	}

}