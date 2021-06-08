package HRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;

public class Activity8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        
        driver.findElement(By.xpath("//span[contains(text(),'Apply Leave')]")).click();
        
        WebElement Leavetype = driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']"));
        Select select = new Select(Leavetype);
        select.selectByIndex(1);
        
        driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).click();
        WebElement month = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
        Select selectmonth = new Select(month);
        selectmonth.selectByVisibleText("May");
        WebElement year = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]"));
        Select selectyear = new Select(year);
        selectyear.selectByVisibleText("2021");
        driver.findElement(By.xpath("//a[contains(text(),'19')]")).click();
        
        driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).click();
        WebElement Tomonth = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
        Select selectTomonth = new Select(Tomonth);
        selectTomonth.selectByVisibleText("May");
        WebElement Toyear = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]"));
        Select selectToyear = new Select(Toyear);
        selectToyear.selectByVisibleText("2021");
        driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
        
        driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
        
        driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
        String Status = driver.findElement(By.xpath("(//table[@class='table hover']/tbody/tr)[last()]/td[6]")).getText();
        System.out.println("Status of the leave application is "+Status);
        driver.close();
               
        

	}

}
