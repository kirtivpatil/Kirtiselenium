package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplicationXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); //chaining process
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		//WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		WebElement loginbutton= driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		driver.close();
		//xpath
		//guru99/xpath

	}

}
