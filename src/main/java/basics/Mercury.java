package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement signon= driver.findElement(By.linkText("SIGN-ON"));
		WebElement signon= driver.findElement(By.partialLinkText("SIGN-"));
		signon.click();
		
		
	}


}
