package Activity4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity4_3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of the page is - "+driver.getTitle());
        String Thirdheader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header text is - "+Thirdheader);
        String color = driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        System.out.println("Color of fifth header is -"+color);
        String Violetclass = driver.findElement(By.xpath("//button[@class = 'ui violet button']")).getAttribute("class");
        System.out.println("Class Attribute values of violet button are - "+Violetclass);
        String Greybutton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Grey Button text is - "+Greybutton);
        
        driver.close();
		
	}

}
