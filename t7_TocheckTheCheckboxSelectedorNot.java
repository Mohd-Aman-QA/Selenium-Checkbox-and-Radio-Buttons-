package Selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t7_TocheckTheCheckboxSelectedorNot {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/checkboxes");
		//driver.navigate().to("https://practice.expandtesting.com/");
		driver.manage().window().maximize();
		
		WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		//checkbox.click();
		
			String checkboxname=checkbox.getAttribute("checked");
			System.out.println(checkboxname);
			
			if(checkboxname.equals("true")) {
				System.out.println("checkbox is already selected");
		}
			else {
				System.out.println("checkbox is not selected");
			}
}
}
