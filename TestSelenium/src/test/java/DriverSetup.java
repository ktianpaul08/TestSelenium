import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {

	WebDriver driver = null;
	public DriverSetup() {
		
	}
	public WebDriver Browser(String browser) {
		switch(browser){
			
			case "Edge":
			System.setProperty("webdriver.edge.driver","D:\\OneDrive\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		      
			break;
			case "Chrome":
				//System.setProperty("webdriver.edge.driver","D:\\OneDrive\\edgedriver_win64\\msedgedriver.exe");
//				driver = new ChromeDriver();
				System.out.println("asdasd");
			break;
		}
		return driver;
	}
	
	
	
	
}
