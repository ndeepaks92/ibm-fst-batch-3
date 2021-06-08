import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriverVerification {
    public static void main(String args[]) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.close();
    }
}