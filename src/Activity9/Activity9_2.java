package Activity9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jar_Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        
        WebElement MultiselectList = driver.findElement(By.xpath("//select[@id='multi-select']"));
        
        Select select = new Select(MultiselectList);
        
        Boolean CheckMultiple = select.isMultiple();
        
        if(CheckMultiple == true) {
        	
        	select.selectByVisibleText("Javascript");
        	select.selectByValue("node");
        	select.selectByIndex(4);
        	select.selectByIndex(5);
        	select.selectByIndex(6);
        	select.deselectByValue("node");
        	select.deselectByIndex(7);
        	
        	System.out.println("First Selected Option is : "+select.getFirstSelectedOption().getText());
        	
        	List<WebElement> SelectedOptions = select.getAllSelectedOptions();
        	
        	for(WebElement i : SelectedOptions) {
        	
        		System.out.println("Selections Options are :"+i.getText());
        	}
        	
        	select.deselectAll();
        	
        }
        
        driver.close();
        
	}

}
