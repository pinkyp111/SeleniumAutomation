package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class balajitempl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");

		RemoteWebDriver scanner = new ChromeDriver();
		// 1.Open the webpage using chrome.
		scanner.get("http://tirupatibalaji.ap.gov.in");
		Thread.sleep(1000);
		scanner.manage().window().maximize();

		// 2.Click on Signup using link text.
		scanner.findElement(By.linkText("Sign Up")).click();  //To find element using linktext(hyperlink)/partial-linktext
		Thread.sleep(3000);

		// 3.Fill up firstname and lastname.
		scanner.findElement(By.name("fName")).sendKeys("pinky");
		scanner.findElement(By.name("lName")).sendKeys("francis");
		
		//Step1: If the "Inspect Page option is not there click on More Tools and then click on Devolepor tools.
		//Step2: To find drop down element we need to first inspect the page and check the tag(if its a "select" tag then this below is the way to do it).
		
		// 4.Choose country name as india.
		Select country = new Select(scanner.findElement(By.name("countryS")));  
		// Here Select is a built-in class and country is its object. 
		//When line 34 is executed, according to this webpage "Country"is a dropdown option(with select tag)...according to this line the "Country" element will be choosen.
		country.selectByVisibleText("India");
		//Here country is the object of class Select using we can choose the different/desired options from the drop-down list of " Country".
		
		// 5.Chooose state as goa
		Select state = new Select(scanner.findElement(By.name("stateS")));
		state.selectByVisibleText("Goa");
	}

}
