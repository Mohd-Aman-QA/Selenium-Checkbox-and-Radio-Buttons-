package Selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t4_deafaultStatusOfRadioButton {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		driver.navigate().to("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		
		WebElement flights=driver.findElement(By.id("flights"));
		flights.click();
		
		
		WebElement roundtrip=driver.findElement(By.xpath("//input[@value='R']"));
		
		WebElement oneway=driver.findElement(By.xpath("//input[@value='S']"));
		//oneway.click();
		
		WebElement checkroundtrip=driver.findElement(By.xpath("//input[@value='R']//parent::label"));
		String roundtripvalue=checkroundtrip.getAttribute("class");
		System.out.println(roundtripvalue);
		
		if(roundtripvalue.equals("active")) {
			oneway.click();
		}
		else {
			roundtrip.click();
		}
	}
}
