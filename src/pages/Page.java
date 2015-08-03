package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	
	public static WebDriver driver;
	
	public static void setDriver(WebDriver driver){
		Page.driver = driver;
	}
	
	public static void verifyPage(String pageInfo[]) throws Exception{
		if (!driver.getTitle().equals(pageInfo[1]))
			throw new Exception(pageInfo[0] + " not found");
	}
	
	public void clickXPath(String[][] pageInfo, String xpath){
		/*clicks inputed XPath and verifies that starting and ending pages are reached
		 *two dimensional is for the value of the page verifications and the name of the
		 *page if there is an error*/
		try{
			verifyPage(pageInfo[0]);
			driver.findElement(By.xpath(xpath)).click();
			verifyPage(pageInfo[1]);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
