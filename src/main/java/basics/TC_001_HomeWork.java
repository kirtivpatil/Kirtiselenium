package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_001_HomeWork {

	public static void main(String[] args) throws InterruptedException {
		
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
		fname.sendKeys("AATest42");
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Testlast42");
		Thread.sleep(3000);
		WebElement empid = driver.findElement(By.id("employeeId"));
		String s=empid.getAttribute("value");
		System.out.println(s);
		WebElement Addemp=driver.findElement(By.xpath("//h1[text()='Add Employee']"));
		String d=Addemp.getText();
		System.out.println(d);
		
		WebElement fname1=driver.findElement(By.xpath("//label[@class='hasTopFieldHelp']"));
		String e=fname1.getText();
		System.out.println(e);
		
		
		/*
		//empid.clear();
		//empid.sendKeys("1114");
		WebElement Savebtn = driver.findElement(By.xpath("//input[@value='Save']"));
		Savebtn.click();
		//******************************************shows stale element reference
		//pim.click();
		//WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		//admin.click();
		WebElement pim1 = driver.findElement(By.xpath("//*[contains(@href,'Pim')]"));
		Thread.sleep(2000);
		pim1.click();
		Thread.sleep(2000);
		WebElement empname = driver.findElement(By.xpath("//input [@id='empsearch_id']"));
		empname.sendKeys("1114");
		Thread.sleep(2000);
		WebElement searchbtn = driver.findElement(By.xpath("//input [@name='_search']"));
		searchbtn.click();
		
		*/
		
		
	


	}

}
