package Selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class t2_ClearTextField {

	static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\lenovo\\Documents\\driver[1]\\driver\\msedgedriver.exe");
	     driver=new EdgeDriver();
	/*	driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		password.clear();
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();*/
		
		 checkpoints();
	}
	
	public static void checkpoints() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.id("user-name"));
		boolean expectedElement=username.isDisplayed();
		if(expectedElement==true) {
			System.out.println("website opened successfully");
		}
		else {
			System.out.println("website not opened successfully");
		}
		username.sendKeys("standard_user");
		username.clear();
		username.sendKeys("standard_user");
		
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
		String expectedurl="https://www.saucedemo.com/inventory.html";
		String actualurl=driver.getCurrentUrl();
		if(expectedurl.equals(actualurl)) {
			System.out.println("login successfully");
		}
		else {
			System.out.println("login unsuccessfully");
		}
	}
}
