package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver scanner=new ChromeDriver();
		scanner.get("https://www.facebook.com/");
		scanner.manage().window().maximize();
	String text1=scanner.findElement(By.id("email")).getAttribute("placeholder");  // use the name of attribute not locator.
	System.out.println(text1);
	
	}

}
