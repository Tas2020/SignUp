package HomeDepot.SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_java {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"headerMyAccountTitle\"]/div")
	WebElement MyAccount;
					
	@FindBy(xpath = "//*[@id=\"SPSORegister\"]/a/span")
	WebElement Register;

	@FindBy(id = "email")
	WebElement Email;

	@FindBy(id = "password-input-field")
	WebElement Password;

	@FindBy(id = "zipCode")
	WebElement ZipCode;

	@FindBy(id = "phone")
	WebElement Phone;

	//@FindBy(id = "verify-phone-checkbox")
	//WebElement PhCkhBox;

	@FindBy(xpath = "//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span")
	WebElement CreateAccount;

	// Constructor of this class
	public SignUp_java(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// This is creating Methods for above Elements
	public void MyAccountclick() {
		MyAccount.click();
	}

	public void Registerbutton() {
		Register.click();

	}

	public void Email() {
		Email.sendKeys("jasminemohsin@hotmail.com");
	}

	public void Password() {
		Password.sendKeys("abc123");
	}

	public void zipcode() {
		ZipCode.sendKeys("22193");

	}

	public void phone() {
		Phone.sendKeys("1234567");

	}

/*	public void Phchkbox() {
		PhCkhBox.click();

	}*/

	public void createAccount() {
		CreateAccount.click();
	}

	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.Homedepot.com");
		driver.manage().window().maximize();
	}
}
