package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement webtable = driver.findElement(By.xpath("//table[@name='courses']"));

		List<WebElement> tableheaders = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));


		System.out.println(tableheaders.size());
		ArrayList<String> ArrayList1= new ArrayList<String>();
		for (WebElement eachheader : tableheaders) {

			String s=eachheader.getText();
			//System.out.println(s);
			ArrayList1.add(s);

		}

		for (int i = 0; i < 3; i++) {

			System.out.println(ArrayList1.get(i));
		}

		ArrayList<String> ArrayList2= new ArrayList<String>();
		ArrayList2.add("Instructor");
		ArrayList2.add("Course");
		ArrayList2.add("Price");

		for (int i = 0; i < 3; i++) {

			System.out.println(ArrayList2.get(i));
		}

		//nassertEquals(ArrayList1, ArrayList2);

		if (ArrayList1.equals(ArrayList2) == true) {
			System.out.println(" Expected column names are correct");
		}

		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='courses']//child::tbody//child::tr"));
		int rownum= rows.size();
		System.out.println("total rows ="+rownum);

		List<WebElement> allcost=driver.findElements(By.xpath("//*[@name=\"courses\"]/tbody/tr/child::td[3]"));
		int total=0;

		for (WebElement eachcost : allcost) {

			String s=eachcost.getText();
			int i=Integer.parseInt(s);  
			total=total+i;

		}
		System.out.println(total);
	}


}


