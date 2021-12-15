package webdriver;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse workspace\\seleniumautomation\\browserdrivers\\chromedriver.exe");

		RemoteWebDriver scanner = new ChromeDriver();
		scanner.get("http://www.facebook.com");
		scanner.manage().window().maximize();
		scanner.findElement(By.name("email")).sendKeys("pinkypappachan");
		scanner.findElement(By.name("pass")).sendKeys("pinky1234");
//scanner.findElement(By.name("login")).click();
		
		scanner.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"))
				.click(); // copy full xpath
		
		Thread.sleep(3000);

		//Select domonth = new Select(scanner.findElement(By.id("month")));

	////	domonth.selectByVisibleText("Dec");

		//Select dob = new Select(scanner.findElement(By.name("birthday_day")));
		//////dob.selectByVisibleText("10");
		////Select yearofb = new Select(scanner.findElement(By.name("birthday_year")));
		//yearofb.selectByVisibleText("2014");

	}

}
