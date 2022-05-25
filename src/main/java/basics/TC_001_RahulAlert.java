package basics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_001_RahulAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement textbox=driver.findElement(By.xpath("//input[@id='name']"));
		textbox.sendKeys("Kirti");
		WebElement alertBtn=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alertBtn.click();
		Alert alertaction = driver.switchTo().alert();

		String alertText = alertaction.getText();
		System.out.println(alertText);
		alertaction.accept();
		
		//confirm
		Thread.sleep(3000);
		WebElement confirmBtn=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirmBtn.click();
		Thread.sleep(3000);
		alertaction.dismiss();



	}









}


