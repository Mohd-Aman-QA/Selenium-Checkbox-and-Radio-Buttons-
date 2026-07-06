package Selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t9_clickcheckbox {

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
				checkbox.click();
		}
			else {
				checkbox.click();
			}
}
}