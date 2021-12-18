package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver scanner = new ChromeDriver();
		scanner.get("https://demoqa.com/alerts");
		scanner.manage().window().maximize();
		
		// button 1
	scanner.findElement(By.id("alertButton")).click();
		System.out.println("clicked button 1");
		System.out.println(scanner.switchTo().alert().getText());
	 Thread.sleep(3000);
	scanner.switchTo().alert().accept();

		// button 2
		scanner.findElement(By.id("timerAlertButton")).click();
		System.out.println("clicked button 2");
		Thread.sleep(5000);
		System.out.println(scanner.switchTo().alert().getText());
		Thread.sleep(3000);
		scanner.switchTo().alert().accept();
		
		// button 3 - accept
		scanner.findElement(By.id("confirmButton")).click();
	    System.out.println("clicked button 3- accept");
		Thread.sleep(3000);
		scanner.switchTo().alert().accept();
		System.out.println("Got Text:"+scanner.findElement(By.id("confirmResult")).getText());
		
		// button 3 - dismiss
		scanner.findElement(By.id("confirmButton")).click();
	        System.out.println("clicked button 3-dismiss");
		Thread.sleep(3000);
		scanner.switchTo().alert().dismiss();
		System.out.println("Got Text:"+scanner.findElement(By.id("confirmResult")).getText());
		
		//button 4
		scanner.findElement(By.id("promtButton")).click();
	    System.out.println("clicked button 4");
		Thread.sleep(3000);	
		scanner.switchTo().alert().sendKeys("Pinky Francis");
		Thread.sleep(3000);	
		scanner.switchTo().alert().accept();
		System.out.println("Got Text:"+ scanner.findElement(By.id("promptResult")).getText());
		//Thread.sleep(3000);
		//System.out.println("clicked button 4.1");
		////scanner.findElement(By.id("promtButton")).click();
		//scanner.switchTo().alert().dismiss();
		//System.out.println("Got Text:"+ scanner.findElement(By.id("promptResult")).getText());
		
		

	}

}
