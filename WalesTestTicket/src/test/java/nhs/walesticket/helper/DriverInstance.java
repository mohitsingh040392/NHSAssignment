package nhs.walesticket.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInstance {
	
	
	static WebDriver driver = null;
	
	//Initiate Driver Instance from parameter received through command line instruction
	
	public static void startDriverInstance() {
		
			String browser = System.getProperty("browser");
			System.out.println("Running Test in Browser:" +browser);
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
				driver= new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			}
			else
			{
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver/exe");
				driver= new ChromeDriver();
			}
			driver.manage().window().maximize();
			}
			
	
	//Return Driver Instance
	
	public static WebDriver getDriverInstance() {
		
		if (driver!=null) {
			return driver;
		}
		else
		{
			DriverInstance.startDriverInstance();
			return driver;
		}
			
	}
	
	public static void setDriverIntanceToNull() {
		
		driver.close();
	}
	
	public static void DriverWaitCondtion() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
}
