package HRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Activity7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='employee-details']/div[@id='sidebar']/ul[@id='sidenav']/li[9]/a[1]")).click();
        driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
        driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys("IBM India");
        driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click();
        driver.close();
		

	}

}
