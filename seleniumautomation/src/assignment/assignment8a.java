package assignment;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class assignment8a {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow=driver.getWindowHandle();
		//System.out.println("the parent windoe handle"+" "+parentWindow);
		//System.out.println("The Url of current page is"+ driver.getCurrentUrl());		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/button")).click();
		java.util.Set<String> allWindow = driver.getWindowHandles();//{a0,a1,a2..};
		//Iterator<String> windowIterator = allWindow.iterator();
		for(String actual:allWindow) {
			if(!actual.equalsIgnoreCase(parentWindow)) {
				
driver.switchTo().window(actual);
System.out.println("The Url of child page is"+ driver.getCurrentUrl());
driver.findElement(By.id("")).getText();
}
			
			Thread.sleep(3000);
			driver.switchTo().window(parentWindow);
			
		}
		System.out.println("The Url of parent page is"+ driver.getCurrentUrl());
		
}
}