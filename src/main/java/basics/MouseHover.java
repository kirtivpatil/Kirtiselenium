package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement mousehoverEle= driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(mousehoverEle).perform();
		List<WebElement> hoverData=driver.findElements(By.xpath("//button[text()='Mouse Hover']//following::div/a"));
		for (WebElement hoversingle : hoverData) {
			
			System.out.println(hoversingle.getText());
			
		}
		
		hoverData.get(0).click();
		Thread.sleep(4000);
		action.moveToElement(mousehoverEle).perform();
		hoverData.get(1).click();



	}

}
