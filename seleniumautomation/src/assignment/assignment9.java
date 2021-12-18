package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Yes, I agree")).click();
		Thread.sleep(3000);
         //driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();
      //   driver.findElement(By.xpath("//div[@id='car_models']//ul//li[2]")).click();
         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pinky");
	}
}