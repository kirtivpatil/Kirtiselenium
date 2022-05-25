package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_001_RahulWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize(); //chaining process
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2.click();

		WebElement countryname = driver.findElement(By.xpath("//input[contains(@placeholder,'Type to Select Countries')]"));
		countryname.sendKeys("Ind");
		Thread.sleep(2000);
		countryname.sendKeys(Keys.ARROW_DOWN);
		countryname.sendKeys(Keys.ARROW_DOWN);
		//countryname.sendKeys(Keys.ARROW_DOWN);
		countryname.sendKeys(Keys.ENTER);

		/*WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select newdrop= new Select(dropdown);
		newdrop.selectByIndex(2);
		WebElement chk1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		chk1.click();
		WebElement chk3= driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		chk3.click();
		Thread.sleep(2000);
		chk1.click();
		chk3.click();*/

		List<WebElement> checkboxes = driver.findElements(By.xpath("//legend[text()='Checkbox Example']/following::input[@type='checkbox']"));
		int chkboxnum=checkboxes.size();
		System.out.println(chkboxnum);
		for (WebElement eachCheckBox : checkboxes) {

			boolean status = eachCheckBox.isSelected();
			System.out.println(status);

		}
		for (WebElement eachCheckBox : checkboxes) {

			eachCheckBox.click();

		}
		for (WebElement eachCheckBox : checkboxes) {

			boolean status = eachCheckBox.isSelected();
			System.out.println(status);

		}


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
