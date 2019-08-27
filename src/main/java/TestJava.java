import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestJava {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
 static WebDriver driver;
	
	@Test
	public void testJava()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search_box = driver.findElement(By.xpath("//input[@name='q']"));
		search_box.sendKeys("Oneplus 7", Keys.ENTER);
		Reporter.log("Hello",true);
		driver.close();
		
	}

}
