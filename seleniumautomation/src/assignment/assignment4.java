package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver scanner=new ChromeDriver();
		scanner.get("https://www.justrechargeit.com/");
		scanner.manage().window().maximize();	
		//To get the page title
		System.out.println("The title of page is"+" "+ scanner.getTitle());
		//To get the current page URL
        System.out.println("The current URL is"+" "+scanner.getCurrentUrl());
        //To click on Create New Account Hyperlink
        scanner.findElement(By.linkText("Create New Account")).click();
        System.out.println("The title of New Page is"+" "+ scanner.getTitle());
        System.out.println("The URL of the new page is"+" "+scanner.getCurrentUrl());
        Thread.sleep(3000);
        //To click on Create New Account Button
        scanner.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td/table[5]/tbody/tr[2]/td/div/table/tbody/tr/td[1]/table/tbody/tr[22]/td/input")).click();
       //To display the error message.
        System.out.println(scanner.findElement(By.xpath("//*[@id=\"nameTD\"]/span")).getText());
        Thread.sleep(3000);
        scanner.navigate().refresh();  // To refresh the existing page
        scanner.navigate().back();   // To go back to the parent page
        scanner.navigate().forward();  // To go to the next page
        
        
	}

}
