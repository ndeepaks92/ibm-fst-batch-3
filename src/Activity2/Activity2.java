package Activity2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String Title = driver.getTitle();
        System.out.println("Title of the page is - "+Title);
        
        Thread.sleep(3000);
        
        WebElement E_Id= driver.findElement(By.id("about-link"));
        WebElement E_Class= driver.findElement(By.className("inverted"));
        WebElement E_LinkText= driver.findElement(By.linkText("About Us"));
        WebElement E_Css= driver.findElement(By.cssSelector("a#about-link"));
        String Text_Id = E_Id.getText();
        String Text_Class = E_Class.getText();
        String Text_LinkText = E_LinkText.getText();
        String Text_Css = E_Css.getText();
        System.out.println("Text is - "+Text_Id);
        System.out.println("Text is - "+Text_Class);
        System.out.println("Text is - "+Text_LinkText);
        System.out.println("Text is - "+Text_Css);
        
        driver.close();

	}

}
