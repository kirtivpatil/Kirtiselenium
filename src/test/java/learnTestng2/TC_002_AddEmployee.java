package learnTestng2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002_AddEmployee {
	@Test()
	public void addEmployee() throws InterruptedException {

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
		WebElement addbtn = driver.findElement(By.name("btnAdd"));
		addbtn.click();
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("AATest56");
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Testlast57");
		Thread.sleep(3000);
		WebElement empid = driver.findElement(By.id("employeeId"));
		String empIdValue=empid.getAttribute("value");
		System.out.println(empIdValue);

		WebElement Savebtn = driver.findElement(By.xpath("//input[@value='Save']"));
		Savebtn.click();
	

		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		WebElement editbtn=driver.findElement(By.xpath("//input[@value='Edit' and @id='btnSave']"));
		editbtn.click();
		
		String gender = "female";
		List<WebElement> radioButtons = driver.findElements(By.xpath("//label[text()='Gender']/following::input[@type='radio']"));
		System.out.println(radioButtons.size());
		WebElement a = driver.findElement(By.xpath("(//label[text()='Gender']/following::input[@type='radio'])[1]/following::label[@for='personal_optGender_1']"));
		String genderLabel=a.getText();
		System.out.println(a.getText());
		
			if(gender.equalsIgnoreCase(genderLabel))
			{
				driver.findElement(By.xpath("(//label[text()='Gender']/following::input[@type='radio'])[1]")).click();
			}
			else {

				driver.findElement(By.xpath("(//label[text()='Gender']/following::input[@type='radio'])[2]")).click();

			}

	

	}






}


