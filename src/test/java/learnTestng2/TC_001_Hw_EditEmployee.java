package learnTestng2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_001_Hw_EditEmployee extends TC_001_Hw_AddEmployee {
	@Test()
	public void EditEmployee() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*//driver.get("https://opensource-demo.orangehrmlive.com/");
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

		//TC_001_Hw_AddEmployee adde= new TC_001_Hw_AddEmployee();

		System.out.println(empIdValue);
		//System.out.println(driver.get(empIdValue));
		WebElement empSearchId = driver.findElement(By.xpath("//input[@id='empsearch_id']"));
		empSearchId.sendKeys(empIdValue);
		 */


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

		WebElement empid1 = driver.findElement(By.xpath("//input[@id='empsearch_id']"));
		empid1.sendKeys(empIdValue);
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='searchBtn']"));
		searchbtn.click();

		List<WebElement> searchedUsers = driver.findElements(By.xpath("(//table[@id='resultTable']/tbody/tr/child::td[2])"));
		for (WebElement oneuser : searchedUsers) {

			if (oneuser.getText().equals(empIdValue)) {

				oneuser.click();

			}

		}

		WebElement editBtn = driver.findElement(By.xpath("//input[@value='Edit' and @id='btnSave']"));
		editBtn.click();
		WebElement genderRadio = driver.findElement(By.xpath("(//input[@name='personal[optGender]'])[2]"));
		genderRadio.click();

		WebElement maritalStatus = driver.findElement(By.id("personal_cmbMarital"));
		Select newdrop= new Select(maritalStatus);
		newdrop.selectByValue("Married");
		driver.findElement(By.xpath("//input[@value='Save']")).click();

	}






}


