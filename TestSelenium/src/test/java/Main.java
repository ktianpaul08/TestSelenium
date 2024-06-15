import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Main {

	
	@Test
	public void main() {
		
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\KRISTIAN PAUL\\eclipse-workspace\\TestSelenium\\Drivers\\msedgedriver.exe");
		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("paul");
		

		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("mypass");
      
      //after test
      //driver.quit();
      
      
    //C:\\Users\\KRISTIAN PAUL\\eclipse-workspace\\TestSelenium\\msedgedriver.exe

	}

}
