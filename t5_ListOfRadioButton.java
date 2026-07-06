package Selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t5_ListOfRadioButton {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		driver.navigate().to("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		
		WebElement flights=driver.findElement(By.id("flights"));
		flights.click();
		
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[@type='radio' and not(@id='holiday_type')]"));
		int numberofradiobutton=radiobuttons.size();
		
		System.out.println(numberofradiobutton);
		
		for(WebElement radiobutton:radiobuttons) {
			String radiobuttonname=radiobutton.getAccessibleName();
			
			System.out.println(radiobuttonname);
			
		}
}
}
