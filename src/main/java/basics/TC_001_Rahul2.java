package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_001_Rahul2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize(); //chaining process
		//**********radio button*************
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2.click();
		
		
		//**********suggestion class example*************

		WebElement countrybox = driver.findElement(By.id("autocomplete"));
		countrybox.sendKeys("IND");
		Thread.sleep(3000);
		List<WebElement> autoselect=driver.findElements(By.xpath("//li[@class='ui-menu-item']//child::div"));
					
		
		int x=autoselect.size();
		System.out.println(x);
		//for (WebElement a: countries) {

		//	System.out.println(a.getText());
		//
		
		//Dropdown}
		
			WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
			Select newdrop= new Select(dropdown);
			newdrop.selectByIndex(1);
		
		//checkbox
			List<WebElement> checkboxes = driver.findElements(By.xpath("//legend[text()='Checkbox Example']/following::input[@type='checkbox']"));
			int chkboxnum=checkboxes.size();
			System.out.println(chkboxnum);
			
			for (WebElement eachCheckBox : checkboxes) {

				eachCheckBox.click();

			}
}
}
