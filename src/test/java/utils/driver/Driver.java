package utils.driver;




import org.openqa.selenium.WebDriver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Driver {

	    // Holds the WebDriver instance
	    public static  WebDriver driver;

	    // Initialize a webDriver instance of required browser
	    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
	    @BeforeSuite
	    public void initializeDriver(){
	    	driver= DriverFactory.getDriver();
	    }

	    // Close the webDriver instance
	    @AfterSuite
	    public void closeDriver(){
	    	driver.quit();
	    }

	}

	

