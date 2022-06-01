package learnTestng2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public abstract class TC_001_Hw_AddEmployee {
	String empIdValue;
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
		fname.sendKeys("AATest543");
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Testlast57");
		Thread.sleep(3000);
		WebElement empid = driver.findElement(By.id("employeeId"));
		empIdValue=empid.getAttribute("value");
		System.out.println(empIdValue);

		WebElement Savebtn = driver.findElement(By.xpath("//input[@value='Save']"));
		Savebtn.click();
		Thread.sleep(2000);

		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
		WebElement pim1 = driver.findElement(By.xpath("//*[contains(@href,'Pim')]"));
		pim1.click();
		WebElement empid1 = driver.findElement(By.xpath("//input[@id='empsearch_id']"));
		empid1.sendKeys(empIdValue);
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='searchBtn']"));
		searchbtn.click();
		WebElement searchtable = driver.findElement(By.xpath("//table[@id='resultTable']"));

		WebElement listedname = driver.findElement(By.xpath("(//table[@id='resultTable']/tbody/tr/td)[3]/a"));
		System.out.println(listedname.getText());
		String foundname=listedname.getText();
		if(foundname =="AATest571") {
			System.out.println("added user found successfully");
		}
		else {
			System.out.println("added user not found");
		}


		System.out.println(empIdValue);

	}










}


