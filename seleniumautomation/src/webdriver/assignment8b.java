package webdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse workspace\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toyota.co.uk/");
		// String parentWindow=driver.getWindowHandle();
		// System.out.println("Parent window handle"+parentWindow);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Yes, I agree")).click();
		driver.findElement(By.xpath("//*[@id=\"ctaBar\"]/a[4]/span[1]")).click();
		ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);

//		WebElement radio_b1 = driver.findElement(By.id("codeweaversMonthlyPaymentCalculation"));
		WebElement radio_b1 = driver.findElement(
				By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div/div/div[1]/div[3]/div[3]/div[2]/label[2]"));

		radio_b1.click();

	}
}
