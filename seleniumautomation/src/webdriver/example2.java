package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\eclipse workspace\\seleniumautomation\\browserdrivers\\chromedriver.exe");
WebDriver scanner1=new ChromeDriver();
scanner1.get("http://www.google.com");
	}

}
