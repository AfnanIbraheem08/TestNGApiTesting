package utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

	
	
public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver== null) {
			
			switch("chrome") {
			case "chrome":
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\afnan\\Downloads\\Tools\\chromedriver_win32\\chromedriver.exe");
           driver = new ChromeDriver();
           break;
			case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\afnan\\Downloads\\Tools\\geckodriver-v0.32.0-win-aarch64\\geckodriver");
			driver = new FirefoxDriver();
              break;
              
			case"safari":
			driver = new SafariDriver();
			break; 
			
			default:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\afnan\\Downloads\\Tools\\chromedriver_win32\\chromedriver.exe");
	          driver = new ChromeDriver();
	           break;
		}
		
		}
		
		return driver;
		
	
		
		}
	
		public static void quitDriver() {
			if(driver!=null) {
				driver.quit();
				driver=null;
			}
	}
}
