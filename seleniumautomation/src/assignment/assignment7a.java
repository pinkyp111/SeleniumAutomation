package assignment;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7a {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm#");
		driver.manage().window().maximize();
		driver.findElement(By.className("login_button")).click();
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		java.util.Set<String> allWindow = driver.getWindowHandles();
		System.out.println("Parent window set:"+allWindow);

		Iterator<String> windowIterator = allWindow.iterator();
		int i=0;
		while (windowIterator.hasNext()) {
			String windowName = windowIterator.next();
			
			System.out.println("Name of window:"+windowName);
			
			if(i==1) {
				driver.switchTo().window(windowName);
				driver.findElement(By.id("nextStep")).click();
				Thread.sleep(2_000);
			}
			i++;
		}

		System.out.println("Exiting now");
		driver.close();
	}
}
