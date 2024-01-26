package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream( System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
//		FileInputStream fis = new FileInputStream( System.getProperty("user.dir") + "/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		
		String browser = browser_maven != null ? browser_maven : browser_properties;
		
		
		if( driver == null ) {
			if( browser.equalsIgnoreCase("chrome") ) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
//				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver");
//				System.setProperty("webdriver.chrome.driver", "/Users/nusratmomo/Downloads/chromedriver");
				driver = new ChromeDriver();
			}
			if( browser.equalsIgnoreCase("firefox") ) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\geckodriver.exe");
//				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/geckodriver");
//				System.setProperty("webdriver.chrome.driver", "/Users/nusratmomo/Downloads/chromedriver");
				driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get(prop.getProperty("QAUrl"));
		}
	    return driver;
	}
	
	
}
