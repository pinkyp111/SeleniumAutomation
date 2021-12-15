package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse workspace\\seleniumautomation\\browserdrivers\\chromedriver.exe");// TO OPEN CHROME DRIVER and open the webpage.
		RemoteWebDriver driver = new ChromeDriver();

		// 1.Open the page
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();   // TO MAXIMIZE THE WEBPAGE 
		Thread.sleep(1000);

		// 2.Fill up data in first 6 edit boxes.
		driver.findElement(By.name("firstName")).sendKeys("Pinky");   //TO FIND ELEMENT USING NAME LOCATOR
		driver.findElement(By.name("lastName")).sendKeys("Francis");
		driver.findElement(By.name("emailAddress")).sendKeys("pinkynew151@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("123456789");
		driver.findElement(By.name("password")).sendKeys("newpassword");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("newpassword");

		// 3.Click on three check boxes.
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();    // TO FIND ELEMENT USING ID LOCATOR
		driver.findElement(By.id("questions[q_137]")).click();
		Thread.sleep(1000);

		// Click Submit Button
		driver.findElement(By.id("submit")).click();

	}
}
