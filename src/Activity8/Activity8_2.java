package Activity8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jar_Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody[1]/tr[1]/td"));
        System.out.println("Number of columns is :"+columns.size());
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody[1]/tr"));
        System.out.println("Number of rows is :"+rows.size());
        
        System.out.println("Cell value at second row second column is :"+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody[1]/tr[2]/td[2]")).getText());
        
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
        
        System.out.println("Cell value at second row second column is :"+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        
        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        
        for(WebElement footervalue : footer) {
        	System.out.println("Footer cell values are : "+footervalue.getText());
        }

	}

}
