package Activity9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        
        WebElement Dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
        Select select = new Select(Dropdown);
        
        select.selectByVisibleText("Option 1");
        select.selectByIndex(2);
        select.selectByValue("3");
        
        List<WebElement> DropDownOptions = select.getOptions();
        
        for(WebElement i: DropDownOptions) {
        	System.out.println("Options in the drop down list are : "+i.getText());
        }
        
        driver.close();
        

	}

}
