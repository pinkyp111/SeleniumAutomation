package webdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class error2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse workspace\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();

		Random p = new Random();
		int randomDest = p.nextInt(7);
		System.out.println("The Random destination city is" + " " + randomDest);
		
		if (randomDest == 0) {
			randomDest = 1;
			System.out.println("The Random destination city if '0' selected is changed to" + randomDest);
		}
		driver.findElement(By.xpath("//select[@name='toPort']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='toPort']/option[" + randomDest + "]")).click();
		String destination = driver.findElement(By.xpath("//select[@name='toPort']/option[" + randomDest + "]"))
				.getAttribute("value");
		System.out.println("The selected destination city name is" + " " + destination);
	}

}
