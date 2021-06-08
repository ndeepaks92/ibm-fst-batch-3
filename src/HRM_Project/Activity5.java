package HRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Activity5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
        driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("DeepakIBM");
        driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
        driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys("test");
        //driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).clear();
        driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
        WebElement Nationality = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
        Select nationality = new Select(Nationality);
        nationality.selectByVisibleText("Indian");
        driver.findElement(By.xpath("//input[@id='personal_DOB']")).clear();
        WebElement monthDOB = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
        Select month = new Select(monthDOB);
        month.selectByVisibleText("May");
        WebElement YearDOB = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]"));
        Select year = new Select(YearDOB);
		year.selectByVisibleText("1990");
		driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.close();

	}

}
