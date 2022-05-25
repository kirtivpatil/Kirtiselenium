package learntestng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Guru99Xpath {
	@Test()	
	public void runner() {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver" , "./drivers/msedgedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//absolute path
		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
		username.sendKeys("Admin");
		//basic path
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		//relativepath
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		loginbtn.click();
		//contains
		WebElement pim = driver.findElement(By.xpath("//*[contains(@href,'Pim')]"));
		pim.click();
		
		//using OR &AND
		driver.findElement(By.xpath("//*[@type='button' or @name='_reset']"));
		WebElement searchname = driver.findElement(By.xpath("//*[@type='text' and @id='empsearch_employee_name_empName']"));
		searchname.sendKeys("Peter");
		WebElement searchsubmit=driver.findElement(By.xpath("//*[@type='button' and @name='_search']"));
		searchsubmit.click();
		
		//Xpath Starts-with
		WebElement link = driver.findElement(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));
		link.click();
		
		//XPath Text() Function
		//WebElement clicklink = driver.findElement(By.xpath("//a[text()='Anderson']"));
		//clicklink.click();
		
		WebElement clickadd = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
				clickadd.click();
		
	
		
		//6) XPath axes methods:
		//a) Following:Xpath=//*[@type='text']//following::input
		WebElement lname=driver.findElement(By.xpath("//*[@type='text']//following::input[2]"));
		lname.sendKeys("Smith");;
		
		//b)Ancestor -Xpath=//*[text()='Enterprise Testing']//ancestor::div
		
		
	}

}
