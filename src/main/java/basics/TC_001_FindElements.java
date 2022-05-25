package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_001_FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); //chaining process
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		//WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		WebElement loginbutton= driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		WebElement pim = driver.findElement(By.xpath("//*[contains(@href,'Pim')]"));
		pim.click();
		//
		WebElement empStatus = driver.findElement(By.id("empsearch_employee_status"));
		Select s1= new Select(empStatus);
		s1.selectByVisibleText("Full-Time Permanent");
		Thread.sleep(3000);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		s1.selectByValue("4");
		
		//findelements
		//close and quit
		driver.getWindowHandle();
		
	


	}

}
