package Activity10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/drag-drop");
        
        System.out.println("Title of the page is : "+driver.getTitle());
        
        Actions builder = new Actions(driver);
        
        WebElement ball = driver.findElement(By.xpath("//img[@id='draggable']"));
        
        builder.moveToElement(ball).clickAndHold().build().perform();
        
        WebElement DropZone1 = driver.findElement(By.xpath("//div[@id='droppable']"));
        
        builder.moveToElement(DropZone1).release().build().perform();
        
        WebElement verifyDZ1 = driver.findElement(By.xpath("//div[@style='background-color: rgb(33, 186, 69);']"));
        
        
        if(verifyDZ1.isDisplayed() == true) {
        	System.out.println("Ball is now in Drop Zone 1");
        }else {
        	System.out.println("Ball is not in Drop Zone 1");
        }
        
        Thread.sleep(2000);
        
        builder.moveToElement(ball).clickAndHold().build().perform();
        WebElement DropZone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
        
        builder.moveToElement(DropZone2).release().build().perform();
        
        WebElement verifyDZ2 = driver.findElement(By.xpath("//div[@id='dropzone2'][@style='background-color: rgb(33, 186, 69);']"));
        
        if(verifyDZ2.isDisplayed() == true) {
        	System.out.println("Ball is now in Drop Zone 2");
        }else {
        	System.out.println("Ball is not in Drop Zone 2");
        }
        
        Thread.sleep(2000);
        
        driver.close();
        

	}

}
