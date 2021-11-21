package utils.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class DriverFactory {
static WebDriver getDriver() {
    WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
}
}