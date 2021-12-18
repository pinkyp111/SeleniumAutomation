package pinky;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class error1 {

	private static Object inputText;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franc\\git\\SeleniumAutomation\\seleniumautomation\\browserdrivers\\chromedriver.exe");
		WebDriver scanner = new ChromeDriver();
		scanner.get("https://demoqa.com/alerts");
		scanner.manage().window().maximize();
		// button 4
		scanner.findElement(By.id("promtButton")).click();
		System.out.println("clicked button 4");
		//Thread.sleep(3000);

		// scanner.switchTo().alert().sendKeys("Pinky Francis");
		// Thread.sleep(2000);
		// scanner.switchTo().alert().accept();
		// System.out.println("Got Text:"+
		// scanner.findElement(By.id("promptResult")).getText());
		// Thread.sleep(3000);
		// System.out.println("clicked button 4.1");
		// scanner.findElement(By.id("promtButton")).click();
		// scanner.switchTo().alert().dismiss();
		// System.out.println("Got Text:"+
		// scanner.findElement(By.id("promptResult")).getText());

//				Alert alert=scanner.switchTo().alert();
////				Thread.sleep(5000);
//				alert.sendKeys("test text");
////				String inputText=alert.getText();
////				System.out.println("input text="+inputText);
////				if(inputText!=null)
////					alert.sendKeys((String) inputText);
//				scanner.findElement(By.id("promtButton")).click();
//				scanner.switchTo().alert().dismiss();

		Alert alert = scanner.switchTo().alert();
		String actualDialogText = alert.getText();
		System.out.println("actualDialogText="+actualDialogText);
		String inputText = "Francis";
		if (inputText != null)
			alert.sendKeys(inputText);
		Thread.sleep(2000);
		alert.accept();
//				

	}

}
