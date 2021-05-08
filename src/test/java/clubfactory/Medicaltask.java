package clubfactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Medicaltask
{
	public static  WebDriver driver  ;
	 @Test
	 public void browserlaunch() throws InterruptedException 
	 {
	 //String chromeDriver="C:\\Users\\user\\Desktop\\dev\\automationconcept\\Drivers\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\dev\\automationconcept\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("wellrx");
	 
	 WebElement new1 = driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
	 JavascriptExecutor j=(JavascriptExecutor)driver;
	 j.executeScript("arguments[0].click()",new1);
	 
	 Thread.sleep(2000);

	 driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
	 Thread.sleep(3000);
	 
	 WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	 first.sendKeys("AMBISOME");
	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("5600 south council road, Oklahoma city,Ok,USA");
	 driver.findElement(By.id("btnSearchInternal")).click();
	 
	 Thread.sleep(3000);
	 
	 List<WebElement> m = driver.findElements(By.xpath("//p[@class='b font125 left mb0']"));

	 for (int i = 0; i < m.size(); i++)
	 {
		WebElement print = m.get(i);
		System.out.println(print.getText());
	}
	
	 
	}

}
