package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahul3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		String title=driver.getTitle();
		System.out.println(title);
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		WebElement window = driver.findElement(By.id("openwindow"));
		window.click();
		Set<String>allWindows=driver.getWindowHandles();
		List<String>arrwindows=new ArrayList<String>(allWindows);
		driver.switchTo().window(arrwindows.get(1));
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
		
		//arrwindows.get(0);
		
		
		//Iterator<String>ie=allWindows.iterator();
/*		while (ie.hasNext()) {
			String childwindow = ie.next();
			driver.switchTo().window(childwindow);
			System.out.println(driver.getTitle());
			
		}*/
		
/*		while (ie.hasNext()) {
			String childwindow = ie.next();
			if (!parentwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
			}
			
			
		}
		driver.switchTo().window(parentwindow);*/


		



	}

}
