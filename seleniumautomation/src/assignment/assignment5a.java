package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver scanner=new ChromeDriver();
		scanner.get("https://www.xe.com/");
		scanner.manage().window().maximize();	
	// To get the value on AMOUNT box using getAttribute();	
		System.out.println(scanner.findElement(By.id("amount")).getAttribute("value"));
	//To get the plain text.	
		String message=scanner.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/section/div[1]/h2")).getText();
		System.out.println(message);
		scanner.close();

	}

}
