package TestGauge.NewGaugeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class GmailPage1 
{
	public WebDriver driver ;
	 
	public GmailPage1(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement UserName;
	@FindBy(xpath="//span[contains(text(), 'Next')]")
    WebElement Next;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;			
	@FindBy(xpath="//div[@role='button' and (.)='Compose']")
	WebElement Compose;		
	@FindBy(xpath="//td//img[2]")
	WebElement Maximize;		
	@FindBy(xpath="//*[@role='combobox']")
	WebElement Email_To;		
	@FindBy(xpath="//*[@name='subjectbox']")
	WebElement Email_Sub;
	@FindBy(xpath="//*[@role = 'textbox']")
	WebElement Email_Body;
	@FindBy(xpath="//td//img[3]")
	WebElement Email_Close;
	

	
	@FindBy(xpath="//*[@aria-label='Drafts 1 unread']")
	WebElement Email_DraftClick;
	
	@FindBy(xpath="//*[@role= 'button' and text()='Send']")
	WebElement Email_Send;
	
	@FindBy(xpath="//*[@aria-label='Sent']")
	WebElement Email_SentClick;
	
	@FindBy(xpath="//div[@class='y6']/span[@class='bog']/span[contains(text() , 'Automation Email Verify')]")
	WebElement Email_Sent_Verify;
	
	@FindBy(xpath="//*[starts-with(@aria-label,'Google Account: Arif')]")
	WebElement Accounts_Click;		

	@FindBy(xpath="//*[text()='Sign out']")
	WebElement LogOut;
	
	public WebElement UserName()
	{
		return UserName;
	}
		public WebElement Next()
	{
		return Next;
	}
		public WebElement Password()
		{
			return Password;
		}			
			public WebElement Compose()
		{
			return Compose;
		}
			public WebElement Maximize()
		{
			return Maximize;
		}
			public WebElement Email_To()
		{
			return Email_To;
		}
			public WebElement Email_Sub()
		{
			return Email_Sub;
		}
			public WebElement Email_Body()
		{
			return Email_Body;
		}
			public WebElement Email_Close()
		{
			return Email_Close;
		}
			public WebElement Email_DraftClick()
		{
			return Email_DraftClick;
		}
		
			public WebElement Email_Send()
		{
			return Email_Send;
		}
		
			public WebElement Email_SentClick()
		{
			return Email_SentClick;
		}
		
			public WebElement Email_Sent_Verify()
		{
			return Email_Sent_Verify;
		}
		
			public WebElement Accounts_Click()
		{
			return Accounts_Click;
		}
		
			public WebElement LogOut()
		{
			return LogOut;
		}
	
}
