package assignment;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment7b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("windowButton")).click();
		
		java.util.Set<String> allWindow = driver.getWindowHandles();
		System.out.println("Parent window set:"+allWindow);
		Iterator<String> windowIterator = allWindow.iterator();
		int i=0;
		while (windowIterator.hasNext()) {
			
			String windowName = windowIterator.next();	
			System.out.println("Name of window:"+windowName);
			
			if(i==1)
			{
				
			driver.switchTo().window(windowName);
			Thread.sleep(5000);
			driver.manage().window().maximize();
			//
			
			
		}
			i++;
			
	}
		Thread.sleep(5000);
		driver.close();	
		
	}
}

