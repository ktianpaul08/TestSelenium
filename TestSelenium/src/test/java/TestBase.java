import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBase {

	DriverSetup driverSetup = new DriverSetup();
	WebDriver result = driverSetup.Browser("Edge");
	JavascriptExecutor js = (JavascriptExecutor)result;
	
	
	public void javascriptEnter(String text, WebElement obj) {
		
		js.executeScript("arguments[0].value='"+ text + "'", obj);
		
	}
}
