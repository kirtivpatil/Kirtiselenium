package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzzScoreTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/46166/lsg-vs-gt-57th-match-indian-premier-league-2022");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='innings_1']/div[1]"));
		//driver.findElements(By))
		



	}

}
