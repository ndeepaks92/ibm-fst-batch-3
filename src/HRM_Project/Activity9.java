package HRM_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]")).click();
        List<WebElement> header_row = driver.findElements(By.xpath("//table[@id='emgcontact_list']/thead/tr"));
        
        for(WebElement Header:header_row) {
        	System.out.println("Column names in the header row are "+Header);
        }
        
        List<WebElement> Data_rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
        
        for(WebElement Data:Data_rows) {
        	String Rowdata =  Data.getText();
        	System.out.println("Values in the data rows are "+Rowdata);
        }
        
        driver.close();
        

	}

}
