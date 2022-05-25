package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); //chaining process
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement loginbutton= driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		String expectedTitle="OrangeHRm";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("TestCase Passed");
			
		}
		else {
			System.out.println("TestCase Failed");
		}
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String getPagesource=driver.getPageSource();
		System.out.println(getPagesource);
		
		

	}

}
