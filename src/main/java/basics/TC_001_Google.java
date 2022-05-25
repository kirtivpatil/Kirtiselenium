package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_001_Google {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize(); //chaining process
		Thread.sleep(5000);
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(2000);
		//WebElement searchclk=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		//searchclk.click();
		/*driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		WebElement searchbox1 = driver.findElement(By.name("q"));
		searchbox1.clear();
		searchbox1.sendKeys("java",Keys.ENTER);
		
		/* operations on webelement -https://rahulshettyacademy.com/AutomationPractice/

		1. click() --> This is used to clickon link,image,button,checkbox,radiobutton etc....

		2. sendKeys() --> This is used for entering text into input fields & for selecting option in dropdown

		3. clear() --> This used for clearing the input fields before entering some data.

		4. getText() --> This will capture any visible text in application

		5. getAttribute() --> This will capture the properties of a webElement

		6. getLocation().x --> This will capture the x coordinate of a webElement

		7. getLocation().y --> This will capture the y coordinate of a webElement

		8. getSize() --> This will capture the size of an input fields

		9. getTagName() --> This will capture the html tag of web elements

		10. isDisplayed() --> This is used to check if a webelement is visible or hidden

		11. isSelected() --> This is used to check if a check box is selected or an option in dropdown is selected or radio button is selected

		12. isEnabled() --> This used to find if a webElement is enabled or disabled */

		
		
		
		
		
	


	}

}
