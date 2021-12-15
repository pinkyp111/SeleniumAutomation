package webdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class blazedemo {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse workspace\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		int randomdepar = getRandomNumber(7);
		System.out.println("The Random departure city is" + " " + randomdepar);
		if (randomdepar == 0) {
			randomdepar = 1;
			System.out.println("The Random departure city if '0' selected is changed to" + randomdepar);
		}
		driver.findElement(By.xpath("//select[@name='fromPort']")).click();
		driver.findElement(By.xpath("//select[@name='fromPort']/option[" + randomdepar + "]")).click();
		String departure = driver.findElement(By.xpath("//select[@name='fromPort']/option[" + randomdepar + "]"))
				.getAttribute("value");
		System.out.println("The selected departure city name is" + " " + departure);

		int randomDest = getRandomNumber(7);
		System.out.println("The Random destination city is" + " " + randomDest);

		if (randomDest == 0) {
			randomDest = 1;
			System.out.println("The Random destination city if '0' selected is changed to" + randomDest);
		}
		driver.findElement(By.xpath("//select[@name='toPort']")).click();
		driver.findElement(By.xpath("//select[@name='toPort']/option[" + randomDest + "]")).click();
		String destination = driver.findElement(By.xpath("//select[@name='toPort']/option[" + randomDest + "]"))
				.getAttribute("value");
		System.out.println("The selected destination city name is" + " " + destination);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

		int randomFlight = getRandomNumber(5);
		driver.findElement(By.xpath("//tr[" + randomFlight + "]/td[1]/input[@type='submit']")).click();

		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Pinky");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Cave Creek Road");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Phoenix");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Arizona");
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("85050");

		int selectRandomCard = getRandomNumber(3);
		driver.findElement(By.xpath("//select[@name='cardType']/option[" + selectRandomCard + "]")).click();
		Thread.sleep(3000);
		String selectedCard = driver
				.findElement(By.xpath("//select[@name='cardType']/option[" + selectRandomCard + "]"))
				.getAttribute("value");
		System.out.println("Visa type" + " " + selectedCard);
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456789");

		driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
		driver.findElement(By.xpath("//input[@id='creditCardYear']"));
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Pinky Francis");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String message = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println("message" + message);

	}

	private static int getRandomNumber(int maxNumber) {
		Random p = new Random();
		System.out.println("maxNumber is" + " " + maxNumber);

		int randomNumber = p.nextInt(maxNumber);
		System.out.println("The Random number is" + " " + randomNumber);

		if (randomNumber == 0) {
			randomNumber = 1;
			System.out.println("Replacing Random number '0' to 1" + randomNumber);
		}

		return randomNumber;
	}

}