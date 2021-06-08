package HRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;

public class Activity6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        WebElement directorymenu = driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']"));
        
        if(directorymenu.isDisplayed() && directorymenu.isEnabled()) {
        	directorymenu.click();
        }
        
		String Headertext = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
		Assert.assertEquals(Headertext, "Search Directory");
		driver.close();
	}

}
