package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//way1
		WebElement iframeEle=driver.findElement(By.xpath("(//iframe)[4]"));
		driver.switchTo().frame(iframeEle);
		//way2
		//driver.switchTo().frame(3);
		//way3
		//driver.switchTo().frame(name or id if present);
		
		WebElement srcLogo =driver.findElement(By.xpath("//img[contains(@alt,'The peaks')]"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='trash']"));
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		//action.moveToElement(srcLogo).clickAndHold(srcLogo).moveToElement(dest).release(srcLogo).build();
		//action.clickAndHold(srcLogo).moveToElement(dest).build().perform();
		action.dragAndDrop(srcLogo, dest).build().perform();
		System.out.println("done");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
		
		

	}

}
