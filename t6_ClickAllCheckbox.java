package Selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class t6_ClickAllCheckbox {

	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox:checkboxs) {
			checkbox.click();
			String checkboxname=checkbox.getAttribute("value");
			System.out.println(checkboxname);
			
		}
}
}