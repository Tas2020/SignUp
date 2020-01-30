package HomeDepot.SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HomeDepot.SignUp.SignUp_java;

public class SignUp_test {
 WebDriver driver;
	@Test
  public void f() {
		SignUp_java home= new SignUp_java(driver);
		home.MyAccountclick();
		home.Registerbutton();
		home.Email();
		home.Password();
		home.zipcode();
		home.phone();
		//home.Phchkbox();
		home.createAccount();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.Homedepot.com");
		driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
