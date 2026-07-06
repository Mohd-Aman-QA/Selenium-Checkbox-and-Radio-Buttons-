package Selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class t8_ListOfCheckboxes {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://practice.expandtesting.com/checkboxes");
		
		driver.manage().window().maximize();
		
		//List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		List<WebElement> checkbox1=driver.findElements(By.xpath("(//input[@type='checkbox'])//following-sibling::label"));
		
		for(WebElement checkbox :checkbox1) {
			String checkboxname=checkbox.getAttribute("for");
			System.out.println(checkboxname);
			
		}
}
}