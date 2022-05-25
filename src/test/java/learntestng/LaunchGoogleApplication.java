package learntestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchGoogleApplication {
	@Test()
	public void googleLaunch()
	{
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
	}

}
