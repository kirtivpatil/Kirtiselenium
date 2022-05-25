package learntestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	
	@Test()
	public void cgoogleLaunch()
	{
		/*System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();*/
		System.out.println("Google");
		
	}
	
	@Test()
	public void bguruLaunch()
	{
		/*System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();*/
		System.out.println("Guru");
	}
	
	@Test()
	public void aorangeLaunch()
	{
		/*System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		*/
		System.out.println("Orange");
	}

}
