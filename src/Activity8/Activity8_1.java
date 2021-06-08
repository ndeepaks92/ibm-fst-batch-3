package Activity8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody[1]/tr[1]/td"));
        System.out.println("Number of columns is :"+columns.size());
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody[1]/tr"));
        System.out.println("Number of rows is :"+rows.size());
        
        
        List<WebElement> Thirdrow = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody[1]/tr[3]/td"));
        for(WebElement Thirdrow1:Thirdrow) {
        	System.out.println("Third row values are :"+Thirdrow1.getText());
        }
        
        WebElement x = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody[1]/tr[2]/td[3]"));
        System.out.println("Cell value at the second row second column is :"+x.getText());
        
        driver.close();

	}

}
