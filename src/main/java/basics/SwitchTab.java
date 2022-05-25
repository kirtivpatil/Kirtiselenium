package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		WebElement opentab = driver.findElement(By.id("opentab"));
		opentab.click();


		Set<String>allWindows=driver.getWindowHandles();
		List<String>arrwindows=new ArrayList<String>(allWindows);
		driver.switchTo().window(arrwindows.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(arrwindows.get(1));
		System.out.println(driver.getTitle());


	}

}
