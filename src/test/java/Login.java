import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.thoughtworks.gauge.Step;

import TestGauge.NewGaugeTest.GmailPage1;
import utils.driver.Driver;

public class Login {
	
	public    WebDriver driver;
	
	   @Step("Sign up as customer with email <arifpract@gmail.com> and <Arif*123>")
	   public void LoginAsCustomerDetails(String email, String password ) {
	        WebDriver webDriver = Driver.driver;
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        GmailPage1 Gpage = new GmailPage1(driver);
	        Gpage.UserName().sendKeys(email);
	    	js.executeScript("arguments[0].click()", Gpage.Next());	    	
	    	Gpage.Password().sendKeys(password);
	       	js.executeScript("arguments[0].click()", Gpage.Next());	 
	     //	String Title1 = driver.getTitle();
	      // 	org.junit.Assert.assertEquals(Title1,Title);
	     
	          
	           
	        
	    }

}
