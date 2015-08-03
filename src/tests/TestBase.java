package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;

public class TestBase {
	
	public static WebDriver driver = new FirefoxDriver();
	public static HomePage homePage = new HomePage(driver);
	
	public TestBase(){
		driver = new FirefoxDriver();
		homePage = new HomePage(driver);
	}
	
	public static void closeDriver(){
		driver.close();
	}
}
