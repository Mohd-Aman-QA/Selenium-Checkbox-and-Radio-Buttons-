package Selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t3_ListOfTextField {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//driver.manage().window().maximize();
		
		List<WebElement> textfields=driver.findElements(By.xpath("//input[@type='text']"));
		int sizeoftextfield=textfields.size();
		
		System.out.println("number of Textfields:-"+sizeoftextfield);
		
		for(WebElement textfield:textfields) {
			String textfieldname=textfield.getAttribute("placeholder");
			System.out.println(textfieldname);
		}
		
	}
}
